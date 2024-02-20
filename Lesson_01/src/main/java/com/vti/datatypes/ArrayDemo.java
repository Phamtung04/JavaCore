package com.vti.datatypes;

public class ArrayDemo {
    public static void main(String[] args) {
        // int[] number = {1, 2, 3, 4};
        int[] number = new int[]{1, 2, 3, 4};
        System.out.println("number[2] = " + number[2]);
        System.out.println("number [" + number.length + "] = " + number[number.length - 1]);

    }
}
