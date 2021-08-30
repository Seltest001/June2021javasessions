package lombokTest;

public class EmpTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setName("Rupa"); 
		e1.setAge(20);
		e1.setCity("NYC"); 
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		
		
				
	}

}
