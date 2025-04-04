package org.dataStructure;
import java.util.Random;
import java.util.Arrays;
public class Array {
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
    int[] large = new int[1000];

    public Array(){
        long start = System.nanoTime();
        for (int i = 0; i< 1000; i++){
            large[i] = (int)( Math.random() * 10);
        }
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + "ms for generating 1000 array values");
        System.out.println(large.length);
    }
}
