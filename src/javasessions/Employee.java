package javasessions;

public class Employee {

	//class variables
	
	String name;
	int age;
	String dob;
	char gender;
	double salary;
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age =  25;
		e1.dob = "01-01-1900";
		e1.gender = 'm';
		e1.salary = 12.33;
		
		System.out.println(e1.name + " "+ e1.age + " " + e1.gender + " " + e1.dob + " " +e1.salary);
		
		Employee e2 = new Employee ();
		
		System.out.println(e2.name + " " + e2.age);
		System.out.println(e2.gender);
		System.out.println(e2.salary);
		System.out.println("--------------------------");
		
		Employee e3 = new Employee();
		e3.name = "Roopa";
		e3.age = 25;
		
		System.out.println(e3.name + " " + e3.age + " " + e3.dob + " " +e3.gender + " "+e3.salary);
				
		
	}

}
