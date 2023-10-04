package Java_Basics;

public class NestedLoopConept {

	public static void main(String[] args) {

		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("+++++++++++++++++++");
		for(int m=0;m<=5;m++) {
			for(int n=0;n<=5;n++) {
				for(int p=0;p<=5;p++) {
					System.out.print(m+""+n+p+" ");
				}
			
	
			}
			System.out.println();
		}
		
	

	}

}
