package com.laxmijavaprg;

//Variables --- primitive and non-primitive
	//primitive 8:  byte, short, *int*, float and *double*, char, *boolean*
	//non-primitive: String, array, collection
	//non-primitive is also called as reference variable
	// Based on the number of copy --- Static and non-static


/* total 12 possible combinations
 * 
 * GLOBAL Variables - 
  Primitive - 
            - Static
                - final           e.g. - Class A{ static final int i=10;}
                - non-final       e.g. - Class A{ static int i=10;}
            - non-Static
                 - final         e.g. - Class A{ final int i=10;}
                 - non-final     e.g. - Class A{ int i=10;}
  non-Primitive
			- Static
			     - final         e.g. - Class A{ static final String name="test";}
                 - non-final     e.g. - Class A{ static String name="test";}
			- non-Static
			     - final         e.g. - Class A{ final String name="test";}
                 - non-final     e.g. - Class A{ String name="test";}

* LOCAL Variables - cannot be static
  Primitive -
             - final             e.g. - void m1() { final int i =10;}
             - non-final        e.g. - void m1() { int i=10;}
  non-Primitive -
             - final            e.g. - void m1() { final String name="test";}
             - non-final        e.g. - void m1() {  String name="test";}
   */


class A {
	
	
	int i=10;
	String firstname="laxmi";
	
	static int j=20;
	static String Lastname="J";
}

public class DemoStaticVar {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println("a1 =");
		System.out.println(a1.i);
		System.out.println(a1.firstname);
		System.out.println(A.j);
		System.out.println(A.Lastname);
		
		A a2 = new A();
		System.out.println("a2 =");
		System.out.println(a2.i);
		System.out.println(a2.firstname);
		System.out.println(A.j);
		System.out.println(A.Lastname);
		
		a1.firstname="Lakshmamma";
		a1.i = 100;
		A.j = 200; //static variables to be referenced by class directly
		A.Lastname ="Jagirdar";
				
		System.out.println("After change a1 =");
		System.out.println(a1.i);
		System.out.println(a1.firstname);
		System.out.println(A.j);
		System.out.println(A.Lastname);
		
		System.out.println("After change a2 =");
		System.out.println(a2.i);
		System.out.println(a2.firstname);
		System.out.println(A.j);
		System.out.println(A.Lastname);
		
	}

}
