package Java_Basics;

public class WhileLoopConcept {

	public static void main(String[] args) {
	
		int i=0;
		
		while(true) {
			System.out.println("Hello abhijit");
			break;
		}
		System.out.println("===========================");
		
		int a=0;// Initialization
		
		while(a<=10)// condition
		{
			System.out.println(a);
			a++;//Increment
			
		}
		System.out.println("===========================");
		int b=0;
		
		while(b<=20) {
			System.out.println(b);
			b=b+2;
		}
		System.out.println("===========================");
		
		int num=0;
		while(num<=100) {
			System.out.println(num);
			if(num%5==0) {
				System.out.println("this number is divisible by 5");
			}
			num++;
		}
		System.out.println("===========================");
		
		
		int score=75;
		
		while(score<=100)
		{
			if(score==75)
			System.out.println("A grade");
			break;
		}
	}
	
	
	

}
