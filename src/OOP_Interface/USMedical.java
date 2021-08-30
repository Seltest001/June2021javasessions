package OOP_Interface;

public interface USMedical {
	int minFee = 10;
	//No method body
	//abstract method:has no method body , only method declaration
	//method prototype
	
	
	public void physioServices();	
	public void cardioServices();	
	public void emergencyServices();	
	public void gynecServices();
	
	  //After jdk 1.8:
	 //one can have a method body with static method
    //can i override this method in fortishospital class?
   // NO strictly not allowed
	
	
	public static void billing () {
		System.out.println("US -- billing");
	}
	
	//2.default method:with method body
	default void getVaccine() {
		System.out.println("US-- vaccine");
	}
	
	
}
