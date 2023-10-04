package Java_Basics;

public class IncreamentAndDrementOperator {

	public static void main(String[] args) {
		
		//1.post increment
		
		int a=10;
		int b=a++;
		
		System.out.println(a);//11
		System.out.println(b);//10
		
		int c=-99;
		int d=c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		//2.pre increment
		
		int e=100;
		int f=++e;
		System.out.println(e);//101
		System.out.println(f);//101
		
		//3 post decrement
		
		int i=200;
		int j=i--;
		System.out.println(i);//199
		System.out.println(j);//199
		
		
		//4.post decrement
		
		int k=500;
		int l=--k;
		System.out.println(k); //499
		System.out.println(l); //499




	}

}
