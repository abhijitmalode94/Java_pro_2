package Abstract_Classes;

public class LoginPage extends Page {
	
	
	public LoginPage() {
		System.out.println("LoginPage-Constuctor");
	}

	@Override
	public void title() {
		System.out.println("LoginPage-title");
		
	}

	@Override
	public void url() {
		System.out.println("LoginPage-Url");
		
	}
	public void resetPwd() {
		System.out.println("Password Reset");
	}
	
	public static void pageCycle() {
		System.out.println("Pageloading Time is 5 sec");
	}
	

}
