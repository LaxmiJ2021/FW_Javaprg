package com.laxmijavaprg;

// example for method overloading

public class MethodOverloading {
	
	
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
		
		
		int result = MethodTest.addNumber(40,10);
  	    System.out.println(result);
  	    
		float fresult = MethodTest.addNumber(30.1f, 4.10f);
		System.out.println(fresult);
		
		

	}

}
