package javasessions;

public class Person {
	
	//static methods:
	//getName() is non-static and it will be stored in heap
	//sendMail() is static and it will be stored in Metaspace(CMA)
	
	public void getname() {
		System.out.println("Get name");
	}
	
	public static void sendMail() {
		System.out.println("Send mail");
	}
	
	public static void main(String [] args) {
		
		Person p = new Person();
		
		p.getname();
		sendMail();
		Person.sendMail();
		
		
	}

}
