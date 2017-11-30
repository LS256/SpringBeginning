package pl.codeforfun.shapes.impl;

import org.springframework.stereotype.Service;

import pl.codeforfun.shapes.IShape;

@Service("trapezeBean")
public class Trapeze implements IShape {

	private double baseLineLength;
	private double sideLineLength;
	private double trapezeHeight;
	
	public void setDimensions(double... dimensions) {
		this.baseLineLength = dimensions[0];
		this.sideLineLength = dimensions[1];
		this.trapezeHeight  = dimensions[2];
	}
	
	public double getShapeArea() {
		return 0.5*(baseLineLength * sideLineLength) * trapezeHeight;
	}
	
	public String toString(){
		return "Area of this " + this.getClass().getSimpleName() + " is: " + this.getShapeArea() ;
	}
}
