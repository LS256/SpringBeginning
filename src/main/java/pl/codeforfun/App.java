package pl.codeforfun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.codeforfun.common.IMessagePrinter;
import pl.codeforfun.common.impl.MessagePrinterImpl;
import pl.codeforfun.fibonacci.Fibonacci;
import pl.codeforfun.shapes.IShape;
import pl.codeforfun.shapes.impl.Circle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.*;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
/*
			ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
			IMessagePrinter msgPrinter = (IMessagePrinter) context.getBean("messagePrinterImpl");
			msgPrinter.messagePrinter();
*/
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		IMessagePrinter msgPrinter = (IMessagePrinter) context.getBean("messagePrinterImpl");
		msgPrinter.setMessage("with Sring");
		String result = msgPrinter.messagePrinter();		
		System.out.println(result);
		
		Fibonacci fibonacci = (Fibonacci) context.getBean("fibonacciBean");
		/**
		 * Declare searched element of Fibonacci series
		 * @param serachedFibonacciNo - is a element number in fibonacci series. For example 10th element of Fibonacci Series is equal to 55
		 */
		int searchedFibonacciElement = 13;
		int searchedFibonacciNo = fibonacci.nFibonacciNo(searchedFibonacciElement );
		System.out.println(searchedFibonacciElement + " element of Fibonacci series is " + searchedFibonacciNo);
	
		/*
		 * Program part where I present spring with reference to multiple objects of the same tape
		 */
		List<IShape> figuresList = new ArrayList<IShape>();
		
		IShape circle = (IShape) context.getBean("circleBean");
			circle.setDimensions(5);
			figuresList.add(circle);
		IShape rectangle = (IShape) context.getBean("rectangleBean");
			rectangle.setDimensions(4,5);
			figuresList.add(rectangle);
		IShape square = (IShape) context.getBean("squareBean");
			square.setDimensions(3);
			figuresList.add(square);
		IShape trapeze = (IShape) context.getBean("trapezeBean");
			trapeze.setDimensions(6, 3, 3);
			figuresList.add(trapeze);
		IShape triangle = (IShape) context.getBean("triangleBean");	
			triangle.setDimensions(5,4);
			figuresList.add(triangle);

		for(IShape shape : figuresList) {
			System.out.format("%5.2f%n", shape.getShapeArea() );
		}
		
		for(IShape shape : figuresList) {
			System.out.println(shape);
		}
		
	}

}
