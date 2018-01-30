package com.yqqq.study.flyweight.patter.sample;

public class FlyWeightClient {

	public static void main(String[] args) {
	
		ShapeFactory sf = new ShapeFactory();
		Shape s = sf.getShapeCircle("yellow");
		s.draw();
	}

}
