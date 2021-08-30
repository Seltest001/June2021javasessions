package javasessions;

public class PersonTest {
	
	public static void main(String [] args) {
		
		Persons p1 = new Persons("Sriki" , 20);
		System.out.println(p1.name + "   " + p1.age);
		
		Persons p2 = new Persons("Shreyu", "California");
		System.out.println(p2.name + "  " + p2.city);
		
		Persons p3 = new Persons ("Srini", 30 ,"NYC");
		System.out.println(p3.name + "   " + p3.age + "   "+p3.city);
		System.out.println("____________________________");
		
		CarBooking c1 = new CarBooking("Toyota","Bangalore", "Mumbai");
		c1.booking();
		
			
		
		
	
		
		

		
		
		
	}

}
