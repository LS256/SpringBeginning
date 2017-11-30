package pl.codeforfun.shapes.impl;

import org.springframework.stereotype.Service;

import pl.codeforfun.shapes.IShape;

@Service("rectangleBean")
public class Rectangle implements IShape {
	private double baseLength;
	private double sideLength;

	public void setDimensions(double... dimensions) {
		this.baseLength = dimensions[0];
		this.sideLength = dimensions[1];
	}

	public double getShapeArea() {
		return baseLength * sideLength;
	}
	
	public String toString(){
		return "Area of this " + this.getClass().getSimpleName() + " is: " + this.getShapeArea() ;
	}

}
