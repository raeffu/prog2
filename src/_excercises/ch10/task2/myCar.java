package _excercises.ch10.task2;

import java.util.Scanner;

public class myCar extends Vehicle {

	public myCar(double no) {
		super(no);
	}

	void accelerate() {
		System.out.print(_currentSpeed + " ");
		_currentSpeed++;
	}

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		myCar car = new myCar(n);
		System.out.println("Current Speed:" + car.getCurrentSpeed());
		System.out.println("Max Speed:" + car.getMaxSpeed());
		car.pedalToTheMetal();

	}
}
