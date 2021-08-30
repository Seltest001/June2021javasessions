package OOP_Interface;

public interface UKMedical {
	int min_fee = 20;
	
	public void ENTServices();	
	public void oncologyServices();	
	public void emergencyServices();
	
	default void getVaccine() {
		System.out.println("UK -- vaccine");
	}
	
	
}
