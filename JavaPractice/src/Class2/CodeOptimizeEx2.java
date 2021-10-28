package Class2;

class C
{
	String str = "abcd";
}

public class CodeOptimizeEx2 {

	public static void main(String[] args) {
		
	// Code to optimize below by replacing RHS variable assignment
		C c1 = new C();
		String s = c1.str;
		int l = s.length();
		System.out.println(l);
		
		
//		reduce 1 line by replacing RHS
		C c2 = new C();
		String s2 = c2.str;
		System.out.println(s2.length());
		
		
//		reduce 1 line by replacing RHS
		C c3 = new C();
		System.out.println(c3.str.length());	
		
//		reduce 1 line by replacing RHS
		System.out.println(new C().str.length());		

	}

}
