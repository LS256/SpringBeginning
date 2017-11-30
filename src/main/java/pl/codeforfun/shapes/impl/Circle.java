package pl.codeforfun.shapes.impl;

import org.springframework.stereotype.Service;

import pl.codeforfun.shapes.IShape;

@Service("circleBean")
public class Circle implements IShape {

	private double pi = Math.PI;
	private double radius;
	
	public void setDimensions(double... param) {
		this.radius = param[0];
	}

	public double getShapeArea() {
		return pi * radius * radius;
	}

	
	public String toString(){
		return "Area of this " + this.getClass().getSimpleName() + " is: " + this.getShapeArea() ;
	}



}
