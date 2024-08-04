package com.example.test.lang;

public class RectangularMain {
    public static void main(String[] args) {
        Rectangular rect1 = new Rectangular(100, 20);
        Rectangular rect2 = new Rectangular(100, 20);

        System.out.println( rect2 );
        System.out.println( rect1 );
        System.out.println( rect2 == rect1 );
        System.out.println( rect2.equals(rect1) );

    }
}
