package javasessions;

public class FunctionsInJava {
	
	public void test() {

		System.out.println("test method........");
	}
	
	
	public String getTrainerName () {
		System.out.println("get trainer name");
		String name = "Rupa";
		return name;
		
	}
	
	public int getPopulationCount() {
		System.out.println("The Population count is ....");
		int india = 200;
		int usa = 150;
		int uk = 100;
		int total = india+usa+uk;
		return total;
		
	}
	
	public int add(int a, int b) {
		System.out.println("The sum of a & b is....");
		int sum = a+b;
		return sum;
	}
	
	//Write a method/function - where we have to pass the student name(String) ip parameter
	//return- student marks (int)
	
	public int getStudentMarks(String name) {
		System.out.println("Getting student marks for : " +name);
		
		if(name.equals("Sachin")) {
			return 90;
		}
		else if(name.equals("Nancy")) {
			return 95;
		}
		else if(name.equals("Bhumikha")) {
			return 100;
		}
		else {
			System.out.println("Student name : " + name +" is not found");
			return -1;
		}
			
		
		
	}

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		
	    obj.test();
	    
	    String n = obj.getTrainerName();
	    System.out.println(n);
	    System.out.println("-------------------");
	    System.out.println(obj.getTrainerName());
	    System.out.println("------------------------");
	    
	    int count = obj.getPopulationCount();
	    System.out.println(count);
	    System.out.println("---------------------");
	    System.out.println(obj.getPopulationCount());
	    System.out.println("------------------------");
	    
	    int m = obj.add(10, 20);
	    System.out.println(m);
	    System.out.println("-----------------------");
	    System.out.println(obj.add(10,20));
	    
	    int sum1 = obj.add(100,105);
	    System.out.println(sum1);
	    
	    int y = obj.getStudentMarks("Bhumikha");
	    System.out.println(y);
	    if(y==-1) {
	    	System.out.println("This student is not in our school system...");
	    	
	    }
	    

	}

}
