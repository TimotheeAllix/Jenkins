package org.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Bonjour, Jenkins avec SonarQube !");
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return (double) a / b;
    }
}
