package com.shahbaz.blog.factoryDesign;

public class ShapeFactory {

	private Shape shape;

	public Shape getShape(String shape) {

		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("circle")) {
			return new Circle();

		} else if (shape.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}
		return null;

	}

}
