package com.kamal.factory.execution;

import com.kamal.factory.Shape;

public class MainClass {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shapeCirc = factory.getShape("CIRCLE");
		Shape shapeRect = factory.getShape("RECTANGLE");
		shapeCirc.drawShape();
		shapeRect.drawShape();
	}
}
