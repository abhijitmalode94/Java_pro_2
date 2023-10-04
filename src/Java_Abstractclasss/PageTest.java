package Java_Abstractclasss;

public class PageTest {

	public static void main(String[] args) {

		LoginPage  lp=new LoginPage();
		
		lp.dispalyLogo();
		lp.displayeHomepage();
		lp.resetPassword();
		lp.title();
		lp.url();
		
		Page.pageCycleTime();
		LoginPage.pageCycleTime();
		
		System.out.println("==================");
		
		//Top Casting
		//Child class object can be referred by abstract parent class ref varibale
		Page p=new LoginPage();
		
		p.title();
		p.url();
		p.displayeHomepage();
		
	
	
	
	
	
	
	}
	
	
	

}
