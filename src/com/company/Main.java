package com.company;

public class Main {

    public static void main(String[] args)
    {
	Shape shape1 = new Shape();
	shape1.getBase();
	shape1.getHeight();
	Triangle triangle = new Triangle();
	triangle.setBase(20.0);
	triangle.setHeight(120.7);
	System.out.println(triangle.getEquation());
    }
}
