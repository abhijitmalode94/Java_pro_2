package ClassesAndOject;

public class Company {
	
	String name;
	int RegNum;
	String location;

	public static void main(String[] args) {
		
		Company c1=new Company();
		c1.name="TCS";
		c1.RegNum=1;
		c1.location="Nag";
		
		Company c2=new Company();
		c2.name="wipro";
		c2.RegNum=2;
		c2.location="Hyd";
		
		
		Company c3=new Company();
		c3.name="Info";
		c3.RegNum=2;
		c3.location="mumbai";
		
		System.out.println(c1.name+" "+c1.RegNum+" "+c1.location);
		System.out.println(c2.name+" "+c2.RegNum+" "+c2.location);
		System.out.println(c3.name+" "+c3.RegNum+" "+c3.location);

	}

}
