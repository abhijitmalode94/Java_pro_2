package Method_overriding_Concept;

public class MobileDevice extends Devices{
	
	
	public void start() {
		System.out.println("MobileDevice-start");
	}
	
	public void switchOff() {
		System.out.println("MobileDevice-switchOff");
	}
	
	public void foldableDevice() {
		System.out.println("MobileDevice-foldableDevice");
	}
	
	@Override
	public void cTypeCharger() {
		System.out.println("MobileDevice-cTypeCharger");
	}
	
	public static void touchscreen() {
		System.out.println("MobileDevice-touchscreen");
	}
	
	public final void andriod13() {
		System.out.println("MobileDevice-andriod13");
		
	}
	
	public final void snapdragon625() {
		System.out.println("MobileDevice-snapdragon625");
	}
	
	
	

}
