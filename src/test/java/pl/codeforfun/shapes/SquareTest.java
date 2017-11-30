package pl.codeforfun.shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SquareTest {
	
	ApplicationContext context;
	IShape square;
	
	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext("application-context.xml");
		square = (IShape) context.getBean("squareBean");
	}
	
	@Test
	public void squareAreaTest(){
		double squareSideLength, tempSquareArea;
		/*
		 * Test for square with side length = 4
		 */
		squareSideLength = 4;
		tempSquareArea = squareSideLength * squareSideLength;
		square.setDimensions(squareSideLength);
		assertEquals(tempSquareArea, square.getShapeArea(), 0.1);
		
		/*
		 * Test for square with side length = 5
		 */
		squareSideLength = 5;
		tempSquareArea = squareSideLength * squareSideLength;
		square.setDimensions(squareSideLength);
		assertEquals(tempSquareArea, square.getShapeArea(), 0.1);	
	}

}
