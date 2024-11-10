package Arrays;


    // super keyword in java example 

// Base class vehicle 
class Vehicle { 
	Vehicle(){
        System.out.println("bharath");
    }
    Vehicle(int a)

    {
        this();
        System.out.println("akash");
    }
} 

// sub class Car extending vehicle 
class Car extends Vehicle {

	Car(){
        super(8);
      
        System.out.println("prabhas");
    }
    Car(int b){
        this();
        System.out.println("pavan");
    }
} 

// Driver Program 
 class java { 
	public static void main(String[] args) 
	{ 
		Car small = new Car(1); 
		 
	} 
}


