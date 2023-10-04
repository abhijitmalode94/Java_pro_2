package Method_overriding_Concept;

public class OnePlus extends MobileDevice{
	@Override
	public void start() {
		System.out.println("OnePlus-start");
	}
	@Override
	public void switchOff() {
		System.out.println("OnePlus-switchOff");

	}
	
	public void tripleCamera() {
		System.out.println("OnePlus-tripleCamera");

	}
	
	
	public static void touchscreen() {
		System.out.println("OnePlus-touchscreen");
	}
	
}
