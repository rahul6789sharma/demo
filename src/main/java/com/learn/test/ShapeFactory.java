package com.learn.test;

public class ShapeFactory {

	public static Shape getShapeInstance(String val) {

		System.out.println("Shape Factory Called : " + val);
		
		if (val.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (val.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		return null;
	}
}


