package wrapperClassConcept;

public class WrapperClassCon {

	public static void main(String[] args) {
		
		String x="100";
		
		System.out.println(x+20);
		
		//String to integer
		
		int i=Integer.parseInt(x);
		
		System.out.println(i+20);
		
		String y="100A";
		
		System.out.println(y+20);
		
		// int j=Integer.parseInt(y);it will give java.lang.NumberFormatException:
		
		String z="100USD";
		String curr[]=z.split("USD");
				System.out.println(curr[0]);
				
				int k=Integer.parseInt(curr[0]);
				
				System.out.println(k+100);
				
				
	// String to double
				
		String a="12.33";
		double d=Double.parseDouble(a);
		System.out.println(d+20);
	
	//String to boolean
		
		String headless="true";
		
		if(Boolean.parseBoolean(headless)) {
			System.out.println("Run in Headless");
		}
		
		// Integer to string
		
		int c=200;
		
		String k1=String.valueOf(c);
		System.out.println(10+k1);
		
		//Boolean to string
		
		boolean flag=true;
		String f1=String.valueOf(flag);
		System.out.println(f1);
	
			
			

	}

}
