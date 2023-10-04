package Java_Abstractclasss;

public abstract class Page {
	
	public abstract void title();
	
	public abstract void url();
	
	public void dispalyLogo() {
		System.out.println("page-logo");
	}
	
	public void displayeHomepage() {
		System.out.println("page-homepage");
	}
	
	public static void pageCycleTime() {
		System.out.println("pageloding time is 10 sec");
	}

}