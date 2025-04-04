package org.dataStructure;
import java.util.*;
import java.util.LinkedList;

public class priorityQu {
    Queue<Double> standard = new LinkedList<>();
    Queue<Double> priority = new PriorityQueue<>();
    Queue<Double> reverse = new PriorityQueue<>(Collections.reverseOrder());

    public priorityQu() {}

    public void func(){

        standard.offer(2.0);
        standard.offer(44.33);
        standard.offer(1.2);
        standard.offer(1.094);
        standard.offer(9.34434);

        System.out.println("Normal queue printing: " + standard);
        while(!standard.isEmpty()) {
            System.out.println(standard.poll());
        }

        priority.offer(2.0);
        priority.offer(44.33);
        priority.offer(1.2);
        priority.offer(1.094);
        priority.offer(9.34434);

        System.out.println("Special priority queue printing: " + priority);
        while(!priority.isEmpty()) {
            System.out.println(priority.poll());
        }

        reverse.offer(2.0);
        reverse.offer(44.33);
        reverse.offer(1.2);
        reverse.offer(1.094);
        reverse.offer(9.34434);

        System.out.println("Reverse priority queue printing: " + reverse);
        while(!reverse.isEmpty()) {
            System.out.println(reverse.poll());
        }
    }
}
