package org.dataStructure;
import java.util.ArrayDeque;
import java.util.Deque;
public class DeQueue {
    // An optimized version of stack/queue that allows you to add from front or back
    // Each function has 2 implementations, one throws an exception and the other returns null/false
    // Throws exception - addFirst/addLast, removeFirst/removeLast, getFirst/getLast
    // Return value - offerFirst/offerLast, pollFirst/pollLast, peekFirst/peekLast

    public static void queueMethods(){
        // Methods inherited from queue interface are equivalent
        Deque<String> queue = new ArrayDeque<String>();
        queue.addLast("a");
        boolean success = queue.offerLast("One");
        if (success) {
            System.out.println("Element added successfully.");
        } else {
            System.out.println("Failed to add element.");
        }
        queue.offerLast("C");


        queue.removeFirst();
        String removed = queue.pollFirst();
        System.out.println("Removed: " + removed);

        String head = queue.getFirst();
        System.out.println("Head: " + head);
        String head2 = queue.peekFirst();
        System.out.println("Head2: " + head2);
    }

    public static void stackMethods(){
        // Dequeue is actually used in preference to the legacy stack
        Deque<String> stack = new ArrayDeque<String>();
        stack.addFirst("A");
        stack.removeFirst();
        stack.getFirst();
    }
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<String>();
        queue.addFirst("A");
        queue.addFirst("C");
        queue.addFirst("A");
        queue.addFirst("C");
        queue.removeFirstOccurrence("A");
        queue.removeLastOccurrence("C");
        boolean isPresent = queue.contains("A");
        int size = queue.size();

        Deque<String> reverse = queue.reversed();
    }
}
