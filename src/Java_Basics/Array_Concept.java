package Java_Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Concept {

	public static void main(String[] args) {

		int arr[]=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[0]);
		System.out.println(arr.length);
		//hi-heighest index
		int len=arr.length;
		int hi=len-1;
		System.out.println(hi);
		
		int a[]= {1,2,3,4,5};
		
		//System.out.println(arr[5]);- It give array index out of bond exception 
		// because we trying to get the data from that index which doesn't exist
		
		
		//for loop
		for(int i=0;i<=len-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("===============");
		//To print all the value of array without any loop
		
		System.out.println(Arrays.toString(arr));
		System.out.println("===============");

		
		double d[]=new double[4];
		d[0]=12.33;
		d[1]=22.33;
		d[2]=33.13;
		d[3]=25.83;
		
		System.out.println(d[0]+d[1]);
		
		System.out.println(Arrays.toString(d));
		System.out.println("===============");
		
		for(double e:d) {
			System.out.println(e);
		}
		System.out.println("===============");

		//char array
		char c[]=new char[4];
		
		c[0]='a';
		c[1]='#';
		c[2]='@';
		c[3]='b';
		
		System.out.println(c.length);
		System.out.println(c.length-1);
		
		for(char e:c)
		{
			System.out.println(e);
		}
		// string array
		
		String str[]=new String[4];
		
		str[0]="Abhijit";
		str[1]="Karan";
		str[2]="Kumar";
		str[3]="Mayur";
		
		for(String e:str) {
		
			System.out.println(e);
			if(e.equals("Mayur"))
			{
				System.out.println("Mayur is brillant");
			}
			if(e.equals("Karan")) 
			{
				System.out.println("Karan is from QA team");
			}
			
			System.out.println("================");
			
			//object array-
			//object class in java is a super class of all the classes in java
			
			Object emp[] = new Object[5];
			emp[0] = "Abhijit";
			emp[1] = 25;
			emp[2] = 25.55;
			emp[3] = 'f';
			emp[4] = true;
			
			System.out.println(emp[0]);
			
			for(Object e1:emp) {
				System.out.println(e1);
				
				
			}
			
		
	}
		

		
		

		
		
		
	}

}
