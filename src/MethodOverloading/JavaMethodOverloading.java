package MethodOverloading;

import java.awt.geom.Arc2D.Float;

public class JavaMethodOverloading {
	
	public void test() {
		System.out.println("method with no parameter");
	}
	public void test(int a)
	{
		System.out.println("Method with 1 parameter ");
	}
	public void test(int a , int b) {
		System.out.println("Method with 2 parameter");
	}
	public void test(int a, double c,float f) {
		System.out.println("method with 3 parameter");
	}

	public static void main(String[] args) {
		
		
		JavaMethodOverloading obj=new JavaMethodOverloading();
		
		obj.test();
		obj.test(10);
		obj.test(100,200);
		obj.test(50, 12.33, 33.12f);

	}

}
