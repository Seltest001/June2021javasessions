package javasessions;

public class Application {
	
	//Method Overloading:
	
	public void test() {
		System.out.println("Default method");
		
	}
	
	public void test(String a) {
		System.out.println(a);
		
	}
	
	public void test(int a, int b) {
		System.out.println("2 parameters");
		
	}
	
	public void test (int a , String b) {
				
	}
	
	public void test(String a , int b) {
		
	}
	
	public void test(byte a, String b) {
		
	}
	
	public void test(long a , String b) {
		
	}
				
				
	
	public static void main(String [] args) {
		
		Application e = new Application();
		
		e.test();
		e.test(12, 10);
		e.test("hi");
		
	}
	
	

}
