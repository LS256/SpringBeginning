package pl.codeforfun.fibonacci;

import org.springframework.stereotype.Service;

@Service("fibonacciBean")
public class Fibonacci {
	
	public int nFibonacciNo( int searchedNo){
		if(searchedNo == 0){
			return 0;
		} else if (searchedNo == 1) {
			return 1;
		} else {
			return nFibonacciNo(searchedNo-2)+ nFibonacciNo(searchedNo-1);
		}
	}
	
	
}
