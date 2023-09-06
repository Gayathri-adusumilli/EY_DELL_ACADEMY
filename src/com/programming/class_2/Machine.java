package com.programming.class_2;

class Machi {
	void start() {
		System.out.println("Machine has started!");
	}

	void stop() {
		System.out.println("Machine has started!");
	}
}

class Camera extends Machi {
	@Override
	void stop() {
		System.out.println("Machine has started!");
	}

	void snap() {
		System.out.println("Photo clicked");
	}
}

public class Machine {
	public static void main(String[] args) {
		Machi m = new Machi();
		m.start();
		m.stop();

		Camera c = new Camera();
		c.start();
		c.stop();
		c.snap();

		Machi pc = new Camera();
		pc.start();
		pc.stop();

		// Upcasting
		Machi m2 = c;
		m2.start();
		m2.stop();
		
		//downcasting
		Machi m3 = new Camera();
		Camera c2 = (Camera)m3;
		c2.start();
		c2.stop();
		c2.snap();
		

	}
}
