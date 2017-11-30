package pl.codeforfun.shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CircleTest {

	ApplicationContext context;
	IShape circle;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("application-context.xml");
		circle = (IShape) context.getBean("circleBean");						
	}

	@Test
	public void circleAreaTest() {
		/**
		 *	Test for Circle with radius 3
		 */
		int tempRadius = 3;
		double tempCircleArea = (Math.PI * tempRadius * tempRadius);
		circle.setDimensions(tempRadius);
		assertEquals(tempCircleArea, circle.getShapeArea(), 0.1);
		
		/**
		 * Test for Circle with radius = 9
		 */
		tempRadius = 9;
		tempCircleArea = (Math.PI * tempRadius * tempRadius);
		circle.setDimensions(tempRadius);
		assertEquals(tempCircleArea, circle.getShapeArea(), 0.1);
		
	}

}
