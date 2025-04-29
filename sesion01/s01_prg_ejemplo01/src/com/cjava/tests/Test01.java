package com.cjava.tests;

public class Test01 {
    public static void main(String[] args) {

        byte a = 0B00000011; // 3 in binary
        short b = 0b00000000_00000010; // 2 in binary
        byte c = (byte)(b+a);
        Byte d = 4;
        byte x = d;
        String s ="5";
        double e = 3;
        System.out.println(s.length() + a-- + c + ++x +e);

    }
}
