package javasessions;

public class Car {
	
	String name;
	int price;
	String model;
	static int wheels = 4;
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "Audi";
		c1.price = 70;
		c1.model = "A6";
		
		
		Car c2 = new Car();
		c2.name = "Honda";
		c2.price = 50;
		c2.model = "Civic";
		
		
		
		Car c3 = new Car();
		c3.name = "Toyota";
		c3.price = 80;
		c3.model = "Camry";
		
		System.out.println(c1.name + "  " + c1.price + "  " + c1.model + "  " + Car.wheels);
		System.out.println(c2.name + "  " + c2.price + "  " + c2.model + "  " + Car.wheels);
		System.out.println(c3.name + "  " + c3.price + "  " + c3.model + "  " + Car.wheels);
		
		
		
		
		
	}

}
