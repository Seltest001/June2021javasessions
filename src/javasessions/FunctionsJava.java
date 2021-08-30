package javasessions;

public class FunctionsJava {
	
	public int getStudentMarks(String name) {
		System.out.println("Getting student marks for : " + name);
		int marks = -1;
		if (name.equals("Manju")) {
			marks = 90;
		} else if (name.equals("nancy")) {
			marks = 95;
		} else if (name.equals("bhumikha")) {
			marks = 100;
		} else {
			System.out.println("student name : " + name + " is not found");
		}
		return marks;
	
	
//	public String appLaunch(String browser) {
		// System.out.println("Browser name is : " + browserName);
		// String browser = "chrome";

		// if(browser.equals("chrome")) {
		// System.out.println("Chrome is launched");
		// }
		// else {
		// System.out.println("Not chrome browser");
		// }
		// return browser;
	}

	

	public static void main(String[] args) {
		
		FunctionsJava obj = new FunctionsJava();
		
		int s1 = obj.getStudentMarks("srini");
		System.out.println(s1);
		
		int s2 = obj.getStudentMarks("nancy");
		System.out.println(s2);
		
		int s3= obj.getStudentMarks("Manju");
		System.out.println(s3);
		
		
	}
}
