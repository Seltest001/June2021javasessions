package javasessions;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		
		EmployeeInfo e1 = new EmployeeInfo ("Tom", 20);
		System.out.println(e1.name + "   "+ e1.age);
		
		//System.out.println((e1.devicesList)); this will give null output,
		//default of arraylist is null
		
		
		ArrayList<String> devList = new ArrayList<String>();
		devList.add("iPhone12");
		devList.add("ipad");
		devList.add("iPhonePro");
		
		EmployeeInfo e2 = new EmployeeInfo("Roopa",30,devList);
		System.out.println(e2.name+ "  "+e2.age + "    "+ e2.devicesList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		EmployeeInfo e2 = new EmployeeInfo("Jay", 30, "iPad");
//		
//		EmployeeInfo e3 = new EmployeeInfo("Ray", "Laptop");
//		
	}

}
