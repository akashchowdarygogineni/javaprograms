package Arrays;




class Base {

	
	Base()
	{
	
		System.out.println(
			"Base Class Constructor Called ");
	}
}

class Derived extends Base {

	
	Derived()
	{

		
		System.out.println(
			"Derived Class Constructor Called ");
	}
}


class GFG {

	
	public static void main(String[] args)
	{

		// Creating an object of sub class
		// inside main() method
		Derived d = new Derived();

		
	}
}

