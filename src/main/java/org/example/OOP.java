package org.example;

public class OOP {
    // Abstract classes are used for subclasses to extend, it provides
    // values/methods with the choice of providing detail.
    // Interfaces are used for 100% abstraction
    // an interface can extend multiple interfaces
    // Level 1 - interfaces: It contains the service details.
    //Level 2 - abstract classes: It contains partial implementation.
    //Level 3 - implementation classes: It contains all implementations.
    //Level 4 - Final Code / Main Method: It have access of all interfaces data.
    abstract class Shape {
        String name;
        abstract double area();
        abstract void printName();
        public Shape(String name) {
            this.name = name;
        }
        public String getName() {return this.name;}
    }
    class Rectangle extends Shape {
        double width;
        public Rectangle(double width, String name){
            super(name);
            this.width = width;
        }
        @Override double area(){
            return width*width;
        }
        @Override void printName() {
            System.out.println(super.getName());
        }
    }

    interface Animal{
        final int XY = -1;
        int XZ = 1; // This is public static final int XZ = 1
        String makeSound(); // public abstract by default
        default void defaultMethod() {
            System.out.println("Default implementation");
        }
        // Static method (JDK 8+)
        static void staticMethod() {
            System.out.println("Static method in interface");
        }
        // Private method (JDK 9+)
        private void privateMethod(int a) {
            System.out.println("Private helper method");
        }
    }
    class Cat implements Animal{
        private String name;
        public Cat(String name) {
            this.name = name;
        }
        public String makeSound(){
            return "Meow";
        }
    }
    // Add interface
    interface Add{
        int add(int a,int b);
    }

    // Sub interface
    interface Sub{
        int sub(int a,int b);
    }

    // Calculator class implementing Add and Sub
    class Cal implements Add , Sub
    {
        // Method to add two numbers
        public int add(int a,int b){
            return a+b;
        }

        // Method to sub two numbers
        public int sub(int a,int b){
            return a-b;
        }

    }
}
