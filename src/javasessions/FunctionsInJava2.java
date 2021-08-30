package javasessions;

public class FunctionsInJava2 {
	
	public void testt() {
		System.out.println("testt method....");
	}

	public String iceCream() {
		System.out.println("I want an IceCream....");
		String flavor = "vanilla";
		return flavor;
	}
	
	public int getPopulationCount() {
		System.out.println("The Population count is....");
		int india = 200;
		int us = 100;
		int uk = 100;
		int count = india+us+uk;
		return count;
	}

	public static void main(String[] args) {
		FunctionsInJava2 obj = new FunctionsInJava2();

		obj.testt();
		
		String m = obj.iceCream();
		System.out.println(m);
		System.out.println("------------------------");
		System.out.println(obj.iceCream());
		
		int total = obj.getPopulationCount();
		System.out.println(total);
		System.out.println("-----------------------------");
		System.out.println(obj.getPopulationCount());

	}

}
