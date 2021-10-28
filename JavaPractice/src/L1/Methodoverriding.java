package L1;

class A
{
	void m1()
	{
	System.out.println("hi I am class A");
	}
}

class B extends A
{
	void m1()
	{
		System.out.println("hi I am class B");
		}
	
}

class C extends A
{
		
}

public class Methodoverriding {
	
		public static void main(String[] args) {
		
     B b1 = new B();
     b1.m1();
     
    
     C c1= new C();
     c1.m1();
     
     
     System.out.println("Below is address of the reference variable b1");
     System.out.println(b1);
    
	}

}
