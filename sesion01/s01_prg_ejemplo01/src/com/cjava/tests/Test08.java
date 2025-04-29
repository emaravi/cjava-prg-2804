package com.cjava.tests;

import java.io.IOException;

public class Test08 {
    public static void main(String[] args) {
        try {

            System.out.println("memoria libre: " + Runtime.getRuntime().freeMemory());
            //System.out.println("memoria total: " + Runtime.getRuntime().totalMemory());
            //System.out.println("memoria maxima: " + Runtime.getRuntime().maxMemory());
            //System.out.println("memoria usada: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            System.out.println("cantided de procesadores: " + Runtime.getRuntime().availableProcessors());
            Runtime.getRuntime().exec("calc");
            System.out.println("memoria libre: " + Runtime.getRuntime().freeMemory());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
