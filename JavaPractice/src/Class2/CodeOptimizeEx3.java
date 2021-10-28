package Class2;

//class DOG HAS-A Belt relationshipt

class Dog
{
	Belt wearBelt()
	{
		Belt a1= new Belt();
		return a1;
	}
	
}

class Belt
{
	void beltOfColor()
	{
		System.out.println("Dog wears a Black Belt");
	}
}

public class CodeOptimizeEx3 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Belt b = d.wearBelt();
		b.beltOfColor();
		
		// can be written as
		
		d.wearBelt().beltOfColor();
		

	}

}
