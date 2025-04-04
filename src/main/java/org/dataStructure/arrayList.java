package org.dataStructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {
    ArrayList<Integer> num = new ArrayList<Integer>();
    ArrayList<String> alphabet = new ArrayList<>();

    public arrayList(){
        long start, duration;
        start = System.nanoTime();
        for (int i = 0; i< 1000; i++){
            num.add((int)( Math.random() * 10));
        }
        duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + "ms for generating 1000 arraylist values");


        start = System.nanoTime();
        for (char letter = 'A'; letter <= 'L'; letter++) {
            alphabet.add(String.valueOf(letter));
        }
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for generating letters A-L");
    }
    public void functionality(){
        num.remove(370);
        System.out.println(num.subList(0, 10));
        num.add(21);
        num.add(391, 22);
        ArrayList<Integer> newNum = new ArrayList<>(num);
        newNum.set(3, 3434);
        System.out.println(newNum.size());
        System.out.println(num.indexOf(21));      // First occurrence of 21
        System.out.println(num.lastIndexOf(21));  // Last occurrence of 21
        num.replaceAll(x -> x * 2);  // Doubles every number in the list
        num.removeIf(x -> x < 5);  // Removes all numbers less than 5
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
    public void timedFunctionality() {
        long start, duration;
        // Timing remove operation
        start = System.nanoTime();
        num.remove(370);
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for removing element at index 370");

        // Timing subList operation
        start = System.nanoTime();
        System.out.println(num.subList(0, 10));
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for retrieving sublist (0 to 10)");

        // Timing add operation (adding 21)
        start = System.nanoTime();
        num.add(21);
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for adding 21");

        // Timing add operation at index 391
        start = System.nanoTime();
        num.add(391, 22);
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for adding 22 at index 391");

        // Timing list copy operation
        start = System.nanoTime();
        ArrayList<Integer> newNum = new ArrayList<>(num);
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for copying num to newNum");

        // Timing set operation
        start = System.nanoTime();
        newNum.set(3, 3434);
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for setting index 3 to 3434 in newNum");

        // Timing size retrieval
        if (num.contains(45)){System.out.println();}
        start = System.nanoTime();
        System.out.println(newNum.size());
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for retrieving size of newNum");

        // Timing indexOf operation
        start = System.nanoTime();
        System.out.println(num.indexOf(21));  // First occurrence of 21
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for finding first occurrence of 21");

        // Timing lastIndexOf operation
        start = System.nanoTime();
        System.out.println(num.lastIndexOf(21));  // Last occurrence of 21
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for finding last occurrence of 21");

        // Timing replaceAll operation
        start = System.nanoTime();
        num.replaceAll(x -> x * 2);  // Doubles every number in the list
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for doubling every number in the list");

        // Timing removeIf operation
        start = System.nanoTime();
        num.removeIf(x -> x < 5);  // Removes all numbers less than 5
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for removing numbers less than 5");

        // Timing iteration using an Iterator
        start = System.nanoTime();
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for iterating through the list with an Iterator");
    }
    public void trimMethod(){
        long start, duration;
        ArrayList<Integer> numeroTrim = new ArrayList<>();
        for (int i = 0; i< 1000; i++){
            numeroTrim.add((int)( Math.random() * 10));
        }
        start = System.nanoTime();
        numeroTrim.trimToSize();
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for trimming arraylist values");
    }
    public void ensureCap(){
        long start, duration;

        ArrayList<Integer> ensure = new ArrayList<>();
        ensure.ensureCapacity(1000);
        start = System.nanoTime();
        for (int i = 0; i< 1000; i++){
            ensure.add((int)( Math.random() * 10));
        }
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for ensure arraylist values to 1000");

        ArrayList<Integer> ensure2 = new ArrayList<>();
        ensure2.ensureCapacity(500);
        start = System.nanoTime();
        for (int i = 0; i< 1000; i++){
            ensure.add((int)( Math.random() * 10));
        }
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for ensure arraylist values to 500");
    }
}
