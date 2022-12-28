//Dec 28-2022-P1
package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.oncologyServices();
		fh.physioServices();
		fh.pediaServices();
		fh.optServices();//independent
		fh.neuroServices();//independent
		fh.pathology();//centralized hospital
		fh.covidTest();
		USMedical.minFee();
		System.out.println(USMedical.admission_fee);
		//USMedical.admission_fee=100;
		
		//USMedical us=new USMedical();not allowed
		//Top Casting
		USMedical us=new FortisHospital();//child class object referred by parent interface
		us.emergencyServices();
		us.orthoServices();
		us.physioServices();
		us.covidTest();
		//us.optService();ref type check
		
	}

}
