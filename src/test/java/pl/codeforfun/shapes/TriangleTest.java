package pl.codeforfun.shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleTest {

	ApplicationContext context;
	IShape triangle;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("application-context.xml");
		triangle = (IShape) context.getBean("triangleBean");						
	}
	
	@Test
	public void triangleAreaTest(){
		double baseLineLenght, triangleHeight, tempTriangleArea;
		
		/**
		 * Check triangle with baseLineLength = 4 and triangleHeight
		 */
		baseLineLenght = 4;
		triangleHeight = 3;
		tempTriangleArea = 0.5 * baseLineLenght * triangleHeight; 
		triangle.setDimensions(baseLineLenght, triangleHeight);
		assertEquals(tempTriangleArea, triangle.getShapeArea(), 0.1);
		
		/**
		 * Check triangle with baseLineLength = 4 and triangleHeight
		 */
		baseLineLenght = 8;
		triangleHeight = 12;
		tempTriangleArea = 0.5 * baseLineLenght * triangleHeight; 
		triangle.setDimensions(baseLineLenght, triangleHeight);
		assertEquals(tempTriangleArea, triangle.getShapeArea(), 0.1);
	}
	

}
