package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Tom",12.33,14.33);
		
				
		e1.setName("Tom");
		
		e1.setSalary(12.33);
		
		e1.setShares(14.33);
		
		System.out.println(e1.name);
		System.out.println(e1.getSalary());
		System.out.println((e1.getShares()));
	}
		

}
