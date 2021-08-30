package OOP_Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical {

	
	// Indian Medical
	@Override
	public void radiologyServices() {
		System.out.println("FH -- radiologyServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}
	//--------------------------------------------------------------------

    // UK Medical
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}
  //------------------------------------------------------------------------------
 // US Medical
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH-- cardioServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");

	}
	
	public void gynecServices() {
		System.out.println("FH -- gynecServices");
		
		
	}
	//--------------------------------------------------------------------
	
	//Fortis Hospital 
	
	public void medicalInsurance() {
		System.out.println("FH-- medicalInsurance");
	}
	
	public void medicalTraining( ) {
		System.out.println("FH-- medicalTraining");
	}
     
	//method hiding
	public static void billing() {
		System.out.println("FH -- billing");
	}
	
	@Override
	public void getVaccine() {
		System.out.println("FH -- vaccine");
	}

}


