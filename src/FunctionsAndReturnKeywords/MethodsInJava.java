package FunctionsAndReturnKeywords;

public class MethodsInJava {
	
	//1.No input and No return
	
	public void Test() {
		System.out.println("this is test method");
	}
	public void Test1() {
		System.out.println("This is test method1");
	}

	// 2.No input and some return
	public int getBillAmmount() {
		System.out.println("Get Bill Ammount");
		
		int foodBill =100;
		int DrinkBill=50;
		int StarterPack=150;
		int TotalBill=foodBill+DrinkBill+StarterPack;
		return TotalBill;
		}
	
	public String getEmployeeName() {
		System.out.println("Get Employee Name");
		String EmpName="Abhijit";
		return EmpName;
		}
	public String getName() {
		System.out.println("get name");
		
		return"Selenium";
	}
	
	public int getNum() {
		return 100;
	}
	
	
	//3.Some Inputs and some return
	//Write a function with two variable a and b
	// return sum of these two variable
	
	public int getSumofTwoVariable(int a, int b) {
		System.out.println("Sum of two number");
		
		int sum =a+b;
		return sum;
	}
	public static void main(String[] args) {
		
		//Object creation to call methods
		
		MethodsInJava obj=new MethodsInJava();
		
		obj.Test();
		obj.Test1();
		
		System.out.println("==============================");
		
		//10% discount on totalFoodBill
		int m=obj.getBillAmmount();
		System.out.println(m-10);
		System.out.println("Actual total Bill ammount="+m);
		System.out.println("==============================");
		
	
	
		
		String emp=obj.getEmployeeName();
		System.out.println(emp);
		
		System.out.println("==============================");
		
		String Emp1=obj.getName();
		System.out.println(Emp1);
		
		System.out.println("==============================");
		System.out.println(obj.getNum());
		
		
		System.out.println(	obj.getSumofTwoVariable(100, 200));
		

	
	}

}
