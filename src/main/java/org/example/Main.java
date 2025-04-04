package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static String time() {
        long start = System.nanoTime();

        // -------- program --------

        // -------------------------------

        long duration = (System.nanoTime() - start) / 1000000;
        return duration + "ms";
    }
}