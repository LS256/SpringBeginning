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
 *
 */
public class TrapezeTest {
	
	ApplicationContext context;
	IShape trapeze;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("application-context.xml");
		trapeze = (IShape) context.getBean("trapezeBean");
	}
	
	@Test
	public void trapezeAreaTest() {
		double baseLineLength, sideLineLength, trapezeHeight, tempTrapezeArea;
		
		/**
		 * Test for trapeze with following parameters:
		 * @param baseLineLength = 5
		 * @param sideLineLength = 4
		 * @param trapezeHeight = 4
		 */
		baseLineLength = 5;
		sideLineLength = 4;
		trapezeHeight = 4;
		tempTrapezeArea = 0.5*(baseLineLength * sideLineLength) * trapezeHeight;
		trapeze.setDimensions(baseLineLength, sideLineLength, trapezeHeight);
		assertEquals(tempTrapezeArea, trapeze.getShapeArea(), 0.1);
		
		
		/**
		 * Test for trapeze with following parameters:
		 * @param baseLineLength = 5
		 * @param sideLineLength = 5
		 * @param trapezeHeight = 3
		 */
		baseLineLength = 5;
		sideLineLength = 5;
		trapezeHeight = 3;
		tempTrapezeArea = 0.5*(baseLineLength * sideLineLength) * trapezeHeight;
		trapeze.setDimensions(baseLineLength, sideLineLength, trapezeHeight);
		assertEquals(tempTrapezeArea, trapeze.getShapeArea(), 0.1);
	
	}

}
