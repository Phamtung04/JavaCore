package com.vti.datatypes;

import java.time.LocalDate;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate date = LocalDate.of(2020, 1, 20);
        System.out.println("date = " + date);
    }
}
