package javasessions;

public class Persons {
	
	String name;
	int age;
	String city;
	
	
	public Persons(String name, int age) {
		this.name = name ;
		this.age = age;		
		
	}


	public Persons(String name, String city) {
		this.name = name;
		this.city = city;
	}


	public Persons(String name, int age, String city) {		
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	
	
	
	
	// Constructors:Name should be as same as its class name.
	//it's not a method but it looks like a method
	//it cannot return any value, it is not void in nature
	//constructor overloading can be done.
	
		
//	public Persons() {
//		System.out.println("default constructor");
//	}
//	
//	public Persons(int i) {
//		System.out.println("1 parameter constructor " + i);		
//		
//	}
//	
//	public Persons(String a, int i) {
//		System.out.println("2 parameter constructor" +"  " +a +"  " + i);
//		
//	}
	
	

}
