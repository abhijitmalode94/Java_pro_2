package ExceptionHandeling;

public class Exception {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			int i=9/0;
		}
		catch(java.lang.Exception e) {
			System.out.println("Airthmatic exception is comming....");
			e.printStackTrace();
		}
		
		System.out.println("bye");
		
		
		

	}

}
