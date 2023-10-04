package Abstract_Classes;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage pg=new LoginPage();
		pg.title();
		pg.url();
		pg.displayHomepage();
		pg.displayLogo();
		pg.resetPwd();
		
		Page.pageCycle();
		LoginPage.pageCycle();
		
		
		System.out.println("===================");
		
		//Top Casting- child class object can be referred by abstract parent class 
		//              ref  variable
		
		Page pg1=new LoginPage();
		pg1.title();
		
		pg1.url();
		pg1.displayHomepage();
		pg1.displayLogo();
		
		
		
		
		

	}

}
