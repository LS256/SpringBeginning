/**
 * 
 */
package pl.codeforfun.shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LS256
 */
public class RectangleTest {

	ApplicationContext context;
	IShape rectangle;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("application-context.xml");
		rectangle = (IShape) context.getBean("rectangleBean");
	}

	@Test
	public void test() {
		double baseLength, sideLength, tempRectangleArea;
		/*
		 * Test for rectangle with following dimensions:
		 * @param baseLength = 5
		 * @param sideLength = 4
		 */
		baseLength = 5;
		sideLength = 4;
		tempRectangleArea = baseLength * sideLength;
		rectangle.setDimensions(baseLength, sideLength);
		assertEquals(tempRectangleArea, rectangle.getShapeArea(), 0.1);
		
		/*
		 * Test for rectangle with following dimensions:
		 * @param baseLength = 2
		 * @param sideLength = 3
		 */
		baseLength = 2;
		sideLength = 3;
		tempRectangleArea = baseLength * sideLength;
		rectangle.setDimensions(baseLength, sideLength);
		assertEquals(tempRectangleArea, rectangle.getShapeArea(), 0.1);
	}
}
