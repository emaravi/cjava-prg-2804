package com.cjava.tests;

public class Test03 {

    public static void main(String[] args) {
        int[] edades = new int[3];
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;

        //int[] edades = {10, 20, 30};
        System.out.println("El promedio es: " + promedio(edades));
    }
    public static double promedio(int[] edades) {
        int suma = 0;
        //for (int i = 0; i < edades.length; i++) {
          //  suma += edades[i];
        //}
        for(int edad : edades) {
            suma += edad;
        }
        return (double) suma / edades.length;
    }
}
