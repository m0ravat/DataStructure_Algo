package org.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Qu {
    Queue<String> queue = new LinkedList<>();

    public Qu(){}

    public void func(){

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        queue.remove();

        System.out.println(queue);
    }
}
