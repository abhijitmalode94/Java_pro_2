package Java_interface;

public class MaxHospital extends Hospital implements USAMedical,UAEMedicals,indiaMedicals {

	@Override
	public void ayurvedaServices() {
		
		System.out.println("India-ayurvedaServices");
		
	}

	@Override
	public void helathServices() {
		System.out.println("India-helathServices");
		
	}

	@Override
	public void panchakarmaServices() {
		System.out.println("India-helathServices");
		
	}

	@Override
	public void pedeaiticServices() {
		System.out.println("UAE-pedeaiticServices");
		
	}

	@Override
	public void coronaServices() {
		System.out.println("UAE-coronaServices");
		
	}

	@Override
	public void skinservices() {
		System.out.println("UAE-skinservices");
		
	}

	@Override
	public void opdServices() {
		System.out.println("UAE-opdServices");
		
	}

	@Override
	public void entservices() {
		System.out.println("UAE-entservices");
		
	}

	@Override
	public void cardiologoServices() {
		System.out.println("UAE-cardiologoServices");
		
	}

	@Override
	public void medicalnews() {
		System.out.println("who-medicalnews");
		
	}

}
