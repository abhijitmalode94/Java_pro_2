package String;

import java.util.Arrays;

// It is an collection of multiple character

public class String_Concept {
	
	public static void main(String [] args) {
		String str="I Love Java coding";
		
		//1.Length of string
		System.out.println(str.length());
		
		//2.gives character at the perticular index
		System.out.println(str.charAt(0));
		
		//3.gives index of specific character
		System.out.println(str.indexOf('J'));
		
		//4.gives the index of specific character in the 2nd occurance.
		System.out.println(str.indexOf('i', 2));
		
	
		//5.lowercase the all character in that perticular string
		System.out.println(str.toLowerCase());
		
		//6.Uppercase the all character in that perticular string
		System.out.println(str.toUpperCase());
		
		//7.trim removes the extra white spaces
		String p="     Hello world     ";
		System.out.println(p.trim());
		
		//8.it removes the all the spaces in the string
		System.out.println(p.replaceAll(" ",""));
		
		
		String a="Hello Java coding";
		
		System.out.println(a.replace(" ", ""));
		
		System.out.println("===================");
		
		String s1="Hello Java";
		
		String s2="hello java";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("===================");
		
		//contains
		
		String st="Welcome to Java Train";
		
		System.out.println(st.contains("Java"));
		
		if (st.contains("Mns"))
		{
			System.out.println("Enroll It");
		}
		else {
			System.out.println("No need of enrollment");
			
		}
		
		// split
		
		String lng="I_Love_Java";
		  String[] arr=lng.split("_");
		  
		  System.out.println(Arrays.toString(arr)
				  );
		
			
			
			
		}
		

	
	}

