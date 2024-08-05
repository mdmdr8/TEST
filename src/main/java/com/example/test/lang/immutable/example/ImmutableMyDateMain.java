package com.example.test.lang.immutable.example;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        date1 = date1.withYear(2025);

        System.out.println(" date 1 = " + date1);
        System.out.println(" date 2 = " + date2);
    }
}
