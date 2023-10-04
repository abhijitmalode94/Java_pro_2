package Method_Builder_Pattern;

public class TestEcomapplication {

	public static void main(String[] args) {
		
		EcomApplication app=new EcomApplication();
		
		app.login("abhijitmalode@gmail.com", "admin@1234")
		.dosearch("applephone")
		.dosearch("applephone", "apple", 255550)
		.addtocart("apple")
		.dopaymnet("1223 5558 5568 0000", 2970)
		.logout();
	}

}
