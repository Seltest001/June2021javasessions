package OOP_Inheritance;

public class BMW extends Car {
	
	int i = 500;
	
	public static void testing() {
		System.out.println("BMW testing, static method");
	}
	
	//@Override
	public void start(){
		System.out.println("BMW -- start");
	}
	
	public void autoParking () {
		System.out.println("BMW -- autoparking");
	}
	
	public int goCar() {
		System.out.println("Go car");
		return 100;
	}
	
	
	@Override
	public void airBags() {
		System.out.println("BMW---air bags");
	}
	
	
	private void fuel() {
		System.out.println("Car -- fuel");
	
	}
	

}
