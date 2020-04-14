package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Picture picture = new Picture();
        Rectangle rectangle = new Rectangle(5, 5, 5, 5);
        Circle circle = new Circle(5, 5, 5);
        Circle circle2 = new Circle(5, 5, 5);
        picture.add(rectangle);
        picture.add(circle);
        double d = picture.getSquare();
        System.out.println(d);

    }
}
