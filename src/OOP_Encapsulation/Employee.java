package OOP_Encapsulation;

public class Employee {
	
	public String name;
	private double salary;
	
	public static void main(String [] args) {
		
		Employee e1 = new Employee ();
		e1.name = "Tom";
		e1.salary = 12.33;
		
		System.out.println(e1.salary);
	}
	

}
