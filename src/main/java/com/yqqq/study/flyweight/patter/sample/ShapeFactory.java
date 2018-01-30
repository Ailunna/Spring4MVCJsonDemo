package com.yqqq.study.flyweight.patter.sample;

import java.util.HashMap;

public class ShapeFactory {
	private static HashMap<String,Shape> shapFactoryMap = new HashMap<String,Shape>();

	public Shape getShapeCircle(String color) {
		Shape shape = shapFactoryMap.get(color);
		if(shape == null) {
			shape = new Circle();
			shapFactoryMap.put(color, shape);
		}
		return shape;
	}
}
