package com.company;

import java.util.ArrayList;

public class Picture {
    private ArrayList<Shape> shapes = new ArrayList<>();
    public void add(Shape shape) {
        shapes.add(shape);
    }
    public double getSquare() {
        double square = 0;
        for (int i = 0; i < shapes.size() ; i++) {
            square += shapes.get(i).getSquare();
        }
        return square;
    }
}
