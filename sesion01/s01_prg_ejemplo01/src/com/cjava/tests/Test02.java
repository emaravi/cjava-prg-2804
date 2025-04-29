package com.cjava.tests;

public class Test02 {

    public static void main(String[] args) {
        double promedio = 12.5;
        String estado = (promedio >= 13.0)?"Aprobado":"Reprobado";
        System.out.println("El promedio es: " + promedio);
        System.out.println("El estado es: " + estado);
    }
}
