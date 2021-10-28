package Class2;

class A
{
		void println(String s)
		{
			System.out.println(s);
		
		}
}

class Systm
{
	static A out=new A();
}

public class SOPEx {
	
	public static void main(String[] args) {
		
		// Code optimization "out" is object of CLass A, println is method of class A,
		//invoked inside class System
		
    Systm.out.println("laxmi");
		
	}

}
