package Method_overriding_Concept;

public class Samsung extends MobileDevice{
	@Override
	public void start() {
		System.out.println("Samsung-start");
	}
	@Override
	public void switchOff() {
		System.out.println("Samsung-switchOff");

	}
	public void theftSafety() {
		System.out.println("Samsung-switchOff");

	}

}
