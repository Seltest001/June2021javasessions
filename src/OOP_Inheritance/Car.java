package OOP_Inheritance;

public class Car extends Vehicle {
	
	int price = 100;
	
	private void fuel() {
		System.out.println("Car -- fuel");
	}
	//can i override this private method in child class?
	//private methods cannot be overridden
	
	
	public static void testing() {
		System.out.println("car testing- static method");
	}
	
	
//	public final void start() {
//		System.out.println("Car --Start");
//	}
	
	public void stop( ) {
		System.out.println("Car -----Stop");
	}
	
	public void refuel () {
		System.out.println("Car-- refuel");
	}
	
	public int goCar() {
		System.out.println("Go car 500");
		return 500;
	}
	
	@Override
	public void airBags() {
		System.out.println("car class-- Air bags");
		
	}
	

}
