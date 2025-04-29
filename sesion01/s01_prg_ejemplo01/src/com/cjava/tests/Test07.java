package com.cjava.tests;

public class Test07 {
    public static void main(String[] args) {
        String categoria = "A";
        switch (categoria){
            case "A":
                System.out.println("Categoria A");
                break;
            case "B":
                System.out.println("Categoria B");
                break;
            case "C":
                System.out.println("Categoria C");
                break;
            default:
                System.out.println("Categoria no válida");
        }
    }
}
