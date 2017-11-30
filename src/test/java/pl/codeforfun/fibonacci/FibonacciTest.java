package pl.codeforfun.fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.codeforfun.common.IMessagePrinter;

@SuppressWarnings("resource")
public class FibonacciTest {
	
	ApplicationContext appContext;
	Fibonacci fibonacci;
	
	@Before
	public void setUp(){
		appContext = new ClassPathXmlApplicationContext("application-context.xml");
		fibonacci = (Fibonacci) appContext.getBean("fibonacciBean");
	}
	
	@Test
	public void FibonacciTest() {
		//	element 0 of Fibonacci series is equlas to 0
		assertEquals(0, fibonacci.nFibonacciNo(0));
		
		//	element 1 of Fibonacci series is equlas to 1
		assertEquals(1, fibonacci.nFibonacciNo(1));
		
		//	element 2 of Fibonacci series is equlas to 1
		assertEquals(1, fibonacci.nFibonacciNo(2));
		
		//	element 3 of Fibonacci series is equlas to 2
		assertEquals(2, fibonacci.nFibonacciNo(3));
		
		//	element 4 of Fibonacci series is equlas to 3
		assertEquals(3, fibonacci.nFibonacciNo(4));
		
		//	element 5 of Fibonacci series is equlas to 5
		assertEquals(5, fibonacci.nFibonacciNo(5));
		
		//	element 6 of Fibonacci series is equlas to 8
		assertEquals(8, fibonacci.nFibonacciNo(6));
		
		//	element 7 of Fibonacci series is equlas to 13
		assertEquals(13, fibonacci.nFibonacciNo(7));
		
		//	element 8 of Fibonacci series is equlas to 21
		assertEquals(21, fibonacci.nFibonacciNo(8));
		
		//	element 9 of Fibonacci series is equlas to 34
		assertEquals(34, fibonacci.nFibonacciNo(9));
		
		//	element 10 of Fibonacci series is equlas to 55
		assertEquals(55, fibonacci.nFibonacciNo(10));
		
		//	element 11 of Fibonacci series is equlas to 89
		assertEquals(89, fibonacci.nFibonacciNo(11));
		
		//	element 12 of Fibonacci series is equlas to 144
		assertEquals(144,fibonacci.nFibonacciNo(12));
		
		//	element 13 of Fibonacci series is equlas to 233
		assertEquals(233, fibonacci.nFibonacciNo(13));
		
		//	element 14 of Fibonacci series is equlas to 377
		assertEquals(377, fibonacci.nFibonacciNo(14));
		
		//	element 15 of Fibonacci series is equlas to 610
		assertEquals(610, fibonacci.nFibonacciNo(15));
		
		//	element 16 of Fibonacci series is equlas to 987
		assertEquals(987, fibonacci.nFibonacciNo(16));
		
		//	element 17 of Fibonacci series is equlas to 1597
		assertEquals(1597, fibonacci.nFibonacciNo(17));
		
		//	element 18 of Fibonacci series is equlas to 2584
		assertEquals(2584, fibonacci.nFibonacciNo(18));
		
		//	element 19 of Fibonacci series is equlas to 4181
		assertEquals(4181, fibonacci.nFibonacciNo(19));
		
		
		
		
	}

}
