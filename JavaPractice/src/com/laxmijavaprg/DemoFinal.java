package com.laxmijavaprg;

/*
Datatype:
	primitive and non-primitive
	
Copy:
		static and non-static
		
Modification:
	    final and non final
	    
Scope:
    Global and local	    
	    
	    e.g. 
*	  Class B {  int i=10} - is primitive,non-static,non final, global variable
*	  Class B{  final int j=10} - is primitive, non-static, final, global variable
*	  Class B(  final static int j=10} - is primitive, static, final, global variable
*	 IMPORTANT static is not allowed for local variable, only global variable can be static
* public static main { static String name="test"} - is non-primitive, static, local variable
	
	*/
// Final is constant. its value cannot be changed or assigned
class B
{
	int i=10;
	final int j=20;
	}

public class DemoFinal {

	public static void main(String[] args) {
	
		//static String name="Test";
		B b1= new B();
		b1.i=100;
		//b1.j=200;
		//FInal b1.j=200 field cannot be assigned
		
		System.out.println(b1.i);
		System.out.println(b1.j);
		
		

	}

}
