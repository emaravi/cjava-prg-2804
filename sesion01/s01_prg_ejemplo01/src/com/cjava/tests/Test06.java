package com.cjava.tests;

public class Test06 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 5) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Hola " + i);
        } while (true);
    }
}
