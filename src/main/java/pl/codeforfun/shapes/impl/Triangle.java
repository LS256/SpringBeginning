package pl.codeforfun.shapes.impl;

import org.springframework.stereotype.Service;

import pl.codeforfun.shapes.IShape;

@Service("triangleBean")
public class Triangle implements IShape {
		
	private double baseLineLength;
	private double triangleHeight;
	
	public void setDimensions(double... dimensions) {
		this.baseLineLength = dimensions[0];
		this.triangleHeight = dimensions[1];
	}
	
	public double getShapeArea() {
		return 0.5 * baseLineLength * triangleHeight;
	}

	public String toString(){
		return "Area of this " + this.getClass().getSimpleName() + " is: " + this.getShapeArea() ;
	}

}
