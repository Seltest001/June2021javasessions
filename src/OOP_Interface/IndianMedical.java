package OOP_Interface;

public interface IndianMedical {
	int minFee = 50;
	
	public void radiologyServices();	
	public void neuroServices();	
	public void emergencyServices();
	
	default void getVaccine() {
		System.out.println("IndianMedical -- vaccine");
	}

}
