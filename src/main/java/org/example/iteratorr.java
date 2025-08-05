package org.example;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class iteratorr {
    public static void listIterator(String[] args) {
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        ListIterator<String> it = names.listIterator();

        System.out.println("Forward iteration:");
        while (it.hasNext()) {
            int index = it.nextIndex();
            String name = it.next();
            System.out.println("Index " + index + ": " + name);

            // Example: replace Bob with Bobby
            if (name.equals("Bob")) {
                it.set("Bobby");
            }

            // Example: add a name after Alice
            if (name.equals("Alice")) {
                it.add("Zara");  // inserted after Alice
            }
        }

        System.out.println("\nModified List: " + names);

        System.out.println("\nBackward iteration:");
        while (it.hasPrevious()) {
            int index = it.previousIndex();
            String name = it.previous();
            System.out.println("Index " + index + ": " + name);

            // Example: remove Zara while going backwards
            if (name.equals("Zara")) {
                it.remove();
            }
        }

        System.out.println("\nFinal List: " + names);
    }
    public static void multIterators(){
        // 1. ArrayList of Integers
        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 2, 3));
        System.out.println("ArrayList (int) using for-each:");
        for (int i : intList) System.out.println(i);

        // Using Iterator
        Iterator<Integer> intListIterator = intList.iterator();
        System.out.println("ArrayList (int) using Iterator:");
        while (intListIterator.hasNext()) {
            System.out.println(intListIterator.next());
        }

        // 2. LinkedList of Strings
        LinkedList<String> stringList = new LinkedList<>(List.of("apple", "banana", "cherry"));
        System.out.println("\nLinkedList (String) using for-each:");
        for (String s : stringList) System.out.println(s);

        // 3. ArrayDeque of Floats
        ArrayDeque<Float> floatDeque = new ArrayDeque<>(List.of(1.1f, 2.2f, 3.3f));
        System.out.println("\nArrayDeque (float) using Iterator:");
        Iterator<Float> floatIterator = floatDeque.iterator();
        while (floatIterator.hasNext()) {
            System.out.println(floatIterator.next());
        }

        // 4. HashSet of Integers
        HashSet<Integer> intSet = new HashSet<>(Set.of(10, 20, 30));
        System.out.println("\nHashSet (int) using for-each:");
        for (int num : intSet) System.out.println(num);

        // 5. LinkedHashSet of Strings
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>(List.of("first", "second", "third"));
        System.out.println("\nLinkedHashSet (String) using Iterator:");
        Iterator<String> orderedIterator = orderedSet.iterator();
        while (orderedIterator.hasNext()) {
            System.out.println(orderedIterator.next());
        }

        // 6. TreeSet of Floats
        TreeSet<Float> sortedFloats = new TreeSet<>(Set.of(3.3f, 1.1f, 2.2f));
        System.out.println("\nTreeSet (float) using for-each:");
        for (float f : sortedFloats) System.out.println(f);
    }
    public static void basicIterator(){
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "Dave"));

        Iterator<String> iterator = names.iterator();

        // hasNext() + next() + remove()
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove(); // remove "Alice"
            } else {
                System.out.println("Processed: " + name);
                break; // break early to use forEachRemaining
            }
        }

        // forEachRemaining()
        iterator.forEachRemaining(name -> System.out.println("Remaining: " + name));

        // Final list after removal
        System.out.println("Final list: " + names); // [Bob, Charlie, Dave]
    }
}
class MyCollection implements Iterable<String> {
    public Iterator<String> iterator() {
        return List.of("One", "Two", "Three").iterator();
    }
}
class NumberBox implements Iterable<Integer> {
    public int[] numbers;

    public NumberBox(int... nums) {
        this.numbers = nums;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumberBoxIterator();
    }

    // Inner class: custom Iterator
    private class NumberBoxIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            return numbers[index++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported.");
        }
    }
}
class EvenNumberBox extends NumberBox implements Iterable<Integer> {

    public EvenNumberBox(int... nums) {
        super(nums);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int index = 0;

            private void advanceToNextEven() {
                while (index < numbers.length && numbers[index] % 2 != 0) {
                    index++;
                }
            }

            @Override
            public boolean hasNext() {
                advanceToNextEven();
                return index < numbers.length;
            }

            @Override
            public Integer next() {
                advanceToNextEven();
                if (index >= numbers.length) throw new NoSuchElementException();
                return numbers[index++];
            }
        };
    }
}
class ReverseNumberBox extends NumberBox implements Iterable<Integer> {

    public ReverseNumberBox(int... nums) {
        super(nums);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int index = numbers.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                return numbers[index--];
            }
        };
    }
}
class RemovableNumberBox implements Iterable<Integer> {
    private final List<Integer> numberList;

    public RemovableNumberBox(Integer... nums) {
        this.numberList = new ArrayList<>(List.of(nums));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int currentIndex = -1;
            private boolean canRemove = false;

            @Override
            public boolean hasNext() {
                return currentIndex + 1 < numberList.size();
            }

            @Override
            public Integer next() {
                canRemove = true;
                return numberList.get(++currentIndex);
            }

            @Override
            public void remove() {
                if (!canRemove) throw new IllegalStateException("Call next() before remove().");
                numberList.remove(currentIndex--);
                canRemove = false;
            }
        };
    }

    public List<Integer> getNumbers() {
        return numberList;
    }
}