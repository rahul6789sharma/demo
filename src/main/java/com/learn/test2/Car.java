package com.learn.test2;

public class Car {

	private static Car car = new Car();

	private Car() {}

	public static Car getInstance() {
		return car;
	}
}


