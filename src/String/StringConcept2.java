package String;

public class StringConcept2 {
	public static void main(String[]args) {
		
		String t1="Selenium";
		String t2="selenium";
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		String str1=new String("Testing");
		String str2=new String("Testing");
		
		String str3="Testing";
		
		String str4="Testing";
		
		System.out.println(str1==str2);
		System.out.println(str3.equals(str4));
		
		
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
		
		String s5 = "Testing";//1 - SCP
		s5 = null;
		//System.out.println(s5.length()); Null pointer exception
		
		
		
		
		
	}

}
