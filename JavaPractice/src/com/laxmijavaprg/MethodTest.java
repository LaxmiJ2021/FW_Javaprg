package com.laxmijavaprg;
/*
 *methods is a block of code for specific task 
 * 
 */

public class MethodTest {
	
	static int subtractnum(int a, int b)
	{
		System.out.println("Subtracting 2 numbers");
		int result = a-b;
		return(result);
	}
	
	static int addNumber(int i, int j)
	{
		System.out.println("Adding 2 int numbers");
		int result=i+j;
		return result;
		
	}
	
	static float addNumber(float i, float j)
	{
		System.out.println("Adding 2 float numbers");
		float result=i+j;
		return result;
		
	}

	public static void main(String[] args) {
		
		//non-static method needs to be called by creating an object of a class
		
		int result = MethodTest.addNumber(40,10);
  	    System.out.println(result);
  	    
		float fresult = MethodTest.addNumber(30.1f, 4.10f);
		System.out.println(fresult);
		
		//static methods can be called directly using class name
		
		int subresult = MethodTest.subtractnum(40,20);
		System.out.println(subresult);

	}

}
