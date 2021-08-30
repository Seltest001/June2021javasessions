package javasessions;

public class NullReferenceConcept {
	
	String name;
	int age;
	
	public static void main(String [] args) {
		
		NullReferenceConcept obj = new NullReferenceConcept();
		
		obj.name = "Sriki";
		obj.age = 10;
		
		obj = null;
		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
	}

}
