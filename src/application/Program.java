package application;

import entities.Circle;

public class Program {

	public static void main(String[] args) {
		
		final Circle ci = new Circle(5.0);

		System.out.println("Raio do Circulo: " + ci.getRadius());
		System.out.println("Area do Circulo: " + ci.getArea());

	}

}
