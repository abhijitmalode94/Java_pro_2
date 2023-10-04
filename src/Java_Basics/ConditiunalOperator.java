package Java_Basics;

public class ConditiunalOperator {

	public static void main(String[] args) {
		
		int i=100;
		int j=200;
		
		// simple if else statement
		if(i==j)
		{
			System.out.println("Both are equal");
		}
		else 
		{
			
			System.out.println("Both are bot equal");
		}
		if(j>=i)
		{
			System.out.println("J is greater than i");
		}
		else
		{
			System.out.println("i is greater than j");
		}
		
		 int total =100;
		if(total!=100)
		{
			System.out.println("Bye");
			
		}else {
			System.out.println("Hi");
		}
		
		//nested if
		
		int mark=50;
		if(mark<=100) {
			System.out.println("valid marks");
			if(mark<=90){
				System.out.println("a grade");
				if(mark>=95) {
					System.out.println("you are eligibel for schorship");
					if(mark==100) {
						System.out.println("free education");
					}
				}
			}
		}
		else if(mark<=80) {
			System.out.println("B grade");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
