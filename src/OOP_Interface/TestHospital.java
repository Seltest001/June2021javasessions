package OOP_Interface;

public class TestHospital {
	
	public static void main(String [] args) {
		
		FortisHospital fh = new FortisHospital();
		
		fh.physioServices();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.oncologyServices();
		fh.radiologyServices();
		fh.neuroServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.gynecServices();
		USMedical.billing();
		FortisHospital.billing();
		fh.getVaccine();
		System.out.println(USMedical.minFee);
		System.out.println(UKMedical.min_fee);
		System.out.println(IndianMedical.minFee);
		
		//top casting: child class object is referred by parent interface
		// reference variable
		
		USMedical us = new FortisHospital();
		
		us.gynecServices();
		us.emergencyServices();
		us.cardioServices();
		us.physioServices();
		
		
		UKMedical uk = new FortisHospital ();
		
		uk.ENTServices();
		uk.emergencyServices();
		uk.oncologyServices();
		
		
		IndianMedical im = new FortisHospital ();
		
		im.emergencyServices();
		im.neuroServices();
		im.radiologyServices();
		
		
	}

}
