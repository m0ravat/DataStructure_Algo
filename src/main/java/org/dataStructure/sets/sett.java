package org.dataStructure.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sett {
    // Hashset fastest, then linked, then tree
    // all store null except tree unless treeSet is empty.
    // hashset doesnt store order, treeset stores natural order and linked stores order they're inserted in.
    public static void hashSet(){
        // Hashset is used for fast access and operation for add remove contains at O(1)
        // without
        // storing order of set
        HashSet<String> set = new HashSet<>();

        // add()
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // contains()
        System.out.println("Contains Banana? " + set.contains("Banana")); // true

        // size()
        System.out.println("Size: " + set.size()); // 3

        // remove()
        set.remove("Apple");
        System.out.println("After removing Apple: " + set); // [Banana, Cherry]

        // isEmpty()
        System.out.println("Is empty? " + set.isEmpty()); // false

        // clear()
        set.clear();
        System.out.println("After clear, is empty? " + set.isEmpty()); // true
    }
    public static void treeSet(){
        // Stores values in natural order using self-balancing binary tree
        // O(n log n) for add remove contains
        TreeSet<Integer> set = new TreeSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // ceiling(x): least element ≥ x
        System.out.println("Ceiling of 25: " + set.ceiling(25)); // 30

        // clear()
        TreeSet<Integer> tempSet = new TreeSet<>(set);
        tempSet.clear();
        System.out.println("After clear(): " + tempSet); // []

        // contains()
        System.out.println("Contains 20? " + set.contains(20)); // true

        // descendingSet()
        System.out.println("Descending: " + set.descendingSet()); // [50, 40, 30, 20, 10]

        // first() and last()
        System.out.println("First: " + set.first());   // 10
        System.out.println("Last: " + set.last());     // 50

        // floor(x): greatest element ≤ x
        System.out.println("Floor of 25: " + set.floor(25)); // 20

        // headSet(toElement)
        System.out.println("HeadSet (to 30): " + set.headSet(30)); // [10, 20]

        // higher(x): strictly greater than x
        System.out.println("Higher than 30: " + set.higher(30)); // 40

        // isEmpty()
        System.out.println("Is empty? " + set.isEmpty()); // false

        // lower(x): strictly less than x
        System.out.println("Lower than 30: " + set.lower(30)); // 20

        // pollFirst() and pollLast()
        System.out.println("pollFirst(): " + set.pollFirst()); // 10 (removes it)
        System.out.println("pollLast(): " + set.pollLast());   // 50 (removes it)
        System.out.println("After polling: " + set);            // [20, 30, 40]

        // remove()
        set.remove(30);
        System.out.println("After remove(30): " + set);         // [20, 40]

        // size()
        System.out.println("Size: " + set.size());              // 2

        // subSet(fromElement, toElement)
        set.addAll(Arrays.asList(25, 35, 45));
        System.out.println("Subset (20 to 45): " + set.subSet(20, 45)); // [20, 25, 35, 40]

        // tailSet(fromElement)
        System.out.println("TailSet (from 35): " + set.tailSet(35));   // [35, 40, 45]
    }
    public static void linkedHashSet(){
        // preserves sorting and uses linkedlist for performance so faster iteration.
        // similar performance to hashset mainly
        // Its constructor can take in amount of buckets initially and load factor (how
        // full the buckets can get before doubling)
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.addFirst(3);
        set.addLast(2);
        set.getFirst();
        set.getLast();
        set.remove(1);
        set.removeFirst();
        set.removeLast();

    }
}
