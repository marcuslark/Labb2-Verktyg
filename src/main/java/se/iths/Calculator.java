package se.iths;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("2 + 2 is " + new Calculator().add(2, 2) + ".");
    }
}