package Java_Basics;

import java.lang.reflect.Method;

public class Methodsin_Java {
	
	//1. no input and no return:
		//void: no return : function can not return anything
		//return type: void
	
	public void test() {
		System.out.println("Test method");
		int a=10;
		int b=20;
		System.out.println(a+b);
		}
	
	//2. no input and some return:
		//return type: int
	
	public int getBillAmmount() {
		System.out.println("Get Billing ammount");
		int foodbills=100;
		int drinkbill=50;
		int totalAmmount=foodbills+drinkbill;
		return totalAmmount;
	}
	
	public int getRestarauntBill() {
		System.out.println("Total Bill");
	
		int chiken_Biryani=250;
		int Tawa_chiken=150;
		int bisleri=20;
		int tanduri_Roti=75;
		int dal_chawal=180;
		int totalBill=chiken_Biryani+Tawa_chiken+bisleri+tanduri_Roti+dal_chawal;
		return  totalBill;
	}

	public String getemployeeName() {
		System.out.println("Employee Name");
		String name="Abhijit";
		return name;
	}
	

	public int getNumber() {
		return 100;
	}
	
	public String getmyName() {
		return"karan";
	}
	public int getstudentMark() {
		
		int a = 100;
		int bonus = 5;
		int negative = 10;
		int finalMarks = a + bonus-negative;
		return finalMarks;
	}
	
	

	public static void main(String[] args) {
		
		Methodsin_Java obj=new Methodsin_Java();
		obj.test();
		
		int m=obj.getBillAmmount();
		System.out.println(m);
		System.out.println(m-10);
		
		int bill=obj.getRestarauntBill();
		System.out.println("Total bill ammount ="+bill);
		
		String myname=obj.getemployeeName();
		System.out.println(myname);
	
		System.out.println(obj.getNumber());
		
		System.out.println(obj.getmyName());
		
		System.out.println(obj.getstudentMark());
				
		

	}

}
