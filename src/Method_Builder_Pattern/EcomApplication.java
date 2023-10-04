package Method_Builder_Pattern;

public class EcomApplication {
	
	
	public  EcomApplication login() {
		System.out.println("Login to application");
		return this;
		
	}
	
	
	public  EcomApplication login(String un, String pwd) {
		System.out.println("Login to application:"+un+" "+pwd);
		return this;
	}
	
	public EcomApplication dosearch(String productname) {;
		System.out.println("Search product :"+productname);
		return this;
	}
	
	public EcomApplication dosearch(String productname, String brand, int price) {
		System.out.println("Search product;"+productname+" "+brand+" "+price);
		return this;
	}
	
	public EcomApplication addtocart(String item) {
		System.out.println("add to cart item "+item);
		return this;
		
	}
	public EcomApplication dopaymnet(String cc,int cvv) {
		System.out.println("do payment"+cc+" "+cvv);
		return this;
		
	}
	public void logout() {
		System.out.println("logout the system");
	}

}
