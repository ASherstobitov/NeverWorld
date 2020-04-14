package com.company;

public class Circle extends Shape{
    int r;
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double getSquare() {
        return r * r * Math.PI;
    }
}
