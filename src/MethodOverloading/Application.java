package MethodOverloading;

public class Application {
	
	public void login() {
		System.out.println("Login page");
	}
	public void login(String username, String password) {
		System.out.println("Login page with username and password");
		
	}
	public  void login(String username, String password,int age) {
		System.out.println("Login page with un, password, and age");
	}
	
	

	public static void main(String[] args) {
		
		Application obj= new Application();
		obj.login();
		obj.login("abhijitmalode@gmail.coim", "Admin@1234");
		obj.login("ankushShing@gmail.com", "ankush@12345", 28);

	}

}
