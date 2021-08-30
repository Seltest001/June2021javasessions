package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b+x+y);
		System.out.println("*************");
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println("-------------------");
		System.out.println("The sum is: " +a+b);
		System.out.println("The sum is: " + (a+b));
		
		double d1=12.33;
		double d2=23.44;
		System.out.println(a+b+d1+d2);
		System.out.println(a+b);
		System.out.println("------------------");
		System.out.println(d1+d2+a+b+x+y);
		System.out.println("*****************************");
		System.out.println(x+y+a+b+d1+d2);
		
		//I Like "Java" and Python
		System.out.println("I Like \"Java\" and Python");

	}

}
