package javasessions;

public class Chain {
	
	public static void main(String [] args) {
		
		
		// non-static methods will be stored in heap memory
		// static methods will be stored in CMA.static methods
		//are not the part of object,they are the common methods
		
		
		Chain c = new Chain();
		
		c.m1();		
		Chain.t1();
		
		
		
	}
	
	public void m1() {
		m2();
		t1();
		
	}
	
	public void m2() {
		System.out.println("m2 method");
		
	}
	
	public static void t1() {
		t2();
		
	}
	
	public static void t2() {
		System.out.println("t2 method");
		
		
	}

}
