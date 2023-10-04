package Java_Abstractclasss;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("LoginPage-Title");		
	}

	@Override
	public void url() {
		System.out.println("LoginPage-url");		
		
	}
	
	public void resetPassword() {
		
		System.out.println("LoginPage-resetPassword");
	}
	
	public static void pageCycleTime() {
		System.out.println("pageloding time is 5 sec");
	}
	

}
