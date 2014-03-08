package com.shahbaz.blog.constructor_args;

public class Triangle {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Triangle(String type) {
		this.type = type;
		System.out.println(" Initialising Triangle");
	}
	
	public void draw() {
		System.out.println(" Drawing "+type+" Triangle");
	}
	
	

}
