package com.learn.test;


public class Engine {

	private String model;

	Engine(){
		System.out.println("Engine Created ..");
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}
}
