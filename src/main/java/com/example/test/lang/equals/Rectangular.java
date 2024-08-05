package com.example.test.lang.equals;

public class Rectangular {
    private int with;
    private int height;

    public Rectangular(int with, int height) {
        this.with = with;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "with=" + with +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangular that = (Rectangular) o;
        return with == that.with && height == that.height;
    }

}
