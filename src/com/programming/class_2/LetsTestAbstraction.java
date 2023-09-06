package com.programming.class_2;

abstract class Shape {
	abstract void draw();

	int length, breadth, height, area, radius;
	double areaofcircle;

	void purpose() {
		System.out.println("Calculate the area:");

	}
}

class Triangle extends Shape {

	@Override
	void draw() {
		int length = 10, breadth = 20;
		int area = (length * breadth) / 2;
		purpose();
		System.out.println("Area of Triangle is:" + area);

	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		int length = 10, breadth = 20;
		int area = (length * breadth);
		purpose();
		System.out.println("Area of Rectangle is:" + area);

	}
}

class Circle extends Shape {

	@Override
	void draw() {
		int radius = 20;
		double areaofcircle = Math.PI * radius * radius;
		purpose();
		System.out.println("Area of circle is:" + areaofcircle);

	}

}

public class LetsTestAbstraction {

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.draw();
		Rectangle re = new Rectangle();
		re.draw();
		Circle ci = new Circle();
		ci.draw();
	}
}
