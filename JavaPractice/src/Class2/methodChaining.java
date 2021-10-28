package Class2;


class AA
{
	BB testA()
	{
		System.out.println("This is calling from class A method");
		BB b1 = new BB();
		return b1;
	}
}

class BB
{
	 CC testB()
	 {
		 System.out.println("This is calling from class B method");
		 CC c1 = new CC();
		 return c1;
	 }
	
}

class CC
{
	void testC()
	{
		System.out.println("This is calling from class C method");
	}
}

public class methodChaining {

	public static void main(String[] args) {
		
		// First way of calling methods
		AA a1 = new AA();
		BB b1 = a1.testA();
		CC c1 = b1.testB();
		c1.testC();
		
		//method chaining example which is equivalent to above 4 lines of code
		//method chaining applicable for non-static method
		//method chaining applicable for other than void and primitive data types
		
		a1.testA().testB().testC();
		a1.testA();
		a1.testA().testB();
		
		
		//method n will be present in the object returned by  method n-1
		//method 3 will be present in the object returned by method 2
		//method 2 will be present in the object returned by method 1
		
		//method chaining works for non-static method and return type other than void

	}

}
