package Abstract_Classes;

public abstract class Page {
	
	public Page() {
		System.out.println("Page-Constuctor");
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public void displayLogo() {
		System.out.println("Page-logo");
	}
	
	public void displayHomepage() {
		System.out.println("Page-HomePage");
	}
	
	public static void pageCycle() {
		System.out.println("Pageloading Time is 10 sec");
	}
	

}
