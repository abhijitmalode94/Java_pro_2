package Method_overriding_Concept;

public class Apple extends MobileDevice{
	
	@Override
	public void start() {
		System.out.println("Apple-start");
	}
	@Override
	public void switchOff() {
		System.out.println("Apple-switchOff");

	}
	
	public void waterResistance() {
		System.out.println("Apple-waterResistance");

	}

}
