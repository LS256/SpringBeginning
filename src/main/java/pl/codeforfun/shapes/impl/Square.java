package pl.codeforfun.shapes.impl;

import org.springframework.stereotype.Service;
import pl.codeforfun.shapes.IShape;

@Service("squareBean")
public class Square implements IShape {

	private double sideLength;
	
	public void setDimensions(double... dimensions) {
		this.sideLength = dimensions[0];	
	}
	
	public double getShapeArea() {
		return sideLength * sideLength;
	}

	public String toString(){
		return "Area of this " + this.getClass().getSimpleName() + " is: " + this.getShapeArea() ;
	}


}
