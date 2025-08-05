package org.dataStructure;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class list {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add(0, "A");
        list.addFirst("D");
        list.addLast("E");
        boolean hasA  = list.contains("A");
        List<String> comparison = new ArrayList<>();
        comparison.add("A");
        comparison.add("D");
        boolean isEqual = list.equals(comparison);
        String getVal = list.get(1);
        String head = list.getFirst();
        String tail = list.getLast();
        boolean isEmpty = list.isEmpty();
        int lastIndex  = list.lastIndexOf("D");
        list.remove("A");
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        List<String> reverse = list.reversed();
        reverse.set(3, "ABC");
        int size = list.size();
        List<String> subList = list.subList(0, 3); // includes 0 index excludes 3
        list.clear();
        String[] arrSt = subList.toArray(new String[0]);
    }
}
class CustomFastList<E> extends AbstractList<E> implements RandomAccess {
    private ArrayList<E> internalList = new ArrayList<>();

    @Override
    public E get(int index) {
        return internalList.get(index);
    }

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public boolean add(E e) {
        return internalList.add(e);
    }

    // You could override other methods for better performance or behavior
}

class TestCustomRandomAccess {
    public static void processList(List<Integer> list) {
        if (list instanceof RandomAccess) {
            System.out.println("Using indexed for-loop (RandomAccess):");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("Using iterator (No RandomAccess):");
            for (Integer item : list) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        CustomFastList<Integer> customList = new CustomFastList<>();
        customList.add(10);
        customList.add(20);
        customList.add(30);

        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30));

        processList(customList);  // Uses indexed for-loop because it implements RandomAccess
        processList(linkedList);  // Uses iterator
    }
}