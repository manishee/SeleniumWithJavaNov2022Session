//Dec 27-2022_p6
package OOP_Interface;

public class FortisHospital extends CentralizedHospital 
							implements USMedical, UKMedical, IndiaMedical 
{
	//US Medical
	@Override
	public void orthoServices()
	{
		System.out.println("FH--OrthoServices");
	}
	
	@Override
	public void physioServices()
	{
		System.out.println("FH--physioServices");
	}
	
	@Override
	public void emergencyServices() {
		System.out.println("FH--emergencyServices");
	}
	
	@Override
	public void covidTest() {
		
	}
	
	//UK Medical
	@Override
	public void ENTServices()
	{
		System.out.println("FH--ENTServices");
	}
	
	@Override
	public void pediaServices()
	{
		
		System.out.println("FH--pediaServices");
	}
	
	//India Medical
	@Override
	public void oncologyServices()
	{
		
		System.out.println("FH--oncologyServices");
	}
	
	@Override
	public void cardioServices()
	{
		System.out.println("FH--cardioServices");
		
	}
	//Non overridden methods => Independent methods
	public void optServices() {
		System.out.println("FH--optServices");
	}
	
	public void neuroServices() {
		System.out.println("FH--neuroServices");
	}

	
	
}
