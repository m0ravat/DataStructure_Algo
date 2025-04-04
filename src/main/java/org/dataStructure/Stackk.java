package org.dataStructure;
import java.util.Stack;

public class Stackk {
    // Last in first out - stack of books
    Stack<String> alphabet = new Stack<>();
    Stack<Integer> num = new Stack<>();
    public Stackk(){
        long start, duration;
        start = System.nanoTime();
        for (char letter = 'A'; letter <= 'L'; letter++) {
            alphabet.push(String.valueOf(letter));
        }
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + "ms for generating letters A-L in a stack");
        System.out.println(alphabet);

        start = System.nanoTime();
        for (int i = 0; i< 1000; i++){
            num.add((int)( Math.random() * 10));
        }
        duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + "ms for generating 1000 stack values");
    }

    public void functionalityStack(){
        alphabet.add("A1");
        System.out.println(alphabet);
        alphabet.push("A2");
        System.out.println(alphabet);

        alphabet.pop();
        System.out.println(alphabet);

        alphabet.peek();
        alphabet.search("D");

        System.out.println("Is stack empty? " + alphabet.empty());  // false
    }

    public void timed(){
        long start, duration;
        start = System.nanoTime();
        alphabet.add("A1");
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(alphabet);
        System.out.println(duration + "ms for adding 'A1'");

        // Push "A2"
        start = System.nanoTime();
        alphabet.push("A2");
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(alphabet);
        System.out.println(duration + "ms for pushing 'A2'");

        // Pop operation (removes top)
        start = System.nanoTime();
        alphabet.pop();
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(alphabet);
        System.out.println(duration + "ms for popping top element");

        // Peek operation (view top)
        start = System.nanoTime();
        String topElement = alphabet.peek();
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Top element: " + topElement);
        System.out.println(duration + "ms for peeking top element");

        // Search for "D" (returns position from top)
        start = System.nanoTime();
        int position = alphabet.search("D");
        duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Position of 'D': " + position);
        System.out.println(duration + "ms for searching 'D'");
    }
}
