package com.example;

public class Main {
    private static int b;
    public static void main(String[] args) {
        int a;
        System.out.println("Hello world!"+ addition (4, 2)+ subtraction (4, 2) + multiplication(4, 2) + division(4, 2));

    }
    public static int addition (int a, int b){
        return a+b;
    }
    public static int subtraction (int a, int b){
        return a-b;
    }
    public static int multiplication (int a, int b){
            return a*b;
    }   
    public static int division (int a, int b){
        return a/b;     
    }
}

        