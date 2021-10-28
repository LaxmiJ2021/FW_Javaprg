package L1;

class P
{

}

class Q
{
	
	public  String toString()
	{ return "laxmi";
	
	}
}


public class MethodOverloadingDemo2 {

	public static void main(String[] args) {
		
		// it displays the address of reference object
		P p1 = new P();
		System.out.println(p1);
		
		// due to toString overloading, it displays the string
		Q q1 = new Q();
		System.out.println(q1);
		
		String s = new String("Test");
		System.out.println(s);

	}

}
