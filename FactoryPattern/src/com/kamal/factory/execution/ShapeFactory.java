package com.kamal.factory.execution;

import com.kamal.factory.CircleShape;
import com.kamal.factory.RectangleShape;
import com.kamal.factory.Shape;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		Shape shape;
		switch (shapeType) {
		case "CIRCLE":
			shape = new CircleShape();
			break;
		case "RECTANGLE":
			shape = new RectangleShape();
			break;
		default:
			shape = null;
		}
		return shape;
	}
}
