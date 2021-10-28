package Class2;

public class OptimizCodeEx {

	public static void main(String[] args) {
		
		//if there is a common variable between 2 statements
		// and if that variable is assigned in its 1st statement
		//then in 2nd statement we can use its RHS as a replacement
		
		// 3 lines of code to print the string length
		
		String name = "Ravi";
		int l = name.length();
		System.out.println(l);
		
		// Optimize above 3 lines to reduce number of lines to do the same task
		
				String name1 = "Ravi";
				System.out.println(name1.length());
				
				// Optimize further to reduce number of lines to do the same task, 
				//but disadvantage is- we cannot reuse "Ravi" since it is not stored in a variable
				
					System.out.println("Ravi".length());		

	}

}
