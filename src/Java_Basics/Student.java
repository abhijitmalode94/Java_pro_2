package Java_Basics;

public class Student {
	
	
	public int getStudentMark(String StudentName) {
		
		System.out.println("getting student mark for :"+StudentName);
		
		if(StudentName.equals("Abhi"))
		{
			return 100;
			
		}
		else if(StudentName.equals("mayur")) {
			return 90;
		}
		else if(StudentName.equals("karan")) {
			return 80;
			
		}
		else
		{
			System.out.println("Student not found");
			return-1;
			
		}
		
	}

	public static void main(String[] args) {
		Student st=new Student();
		int m1=st.getStudentMark("karan");
		System.out.println(m1);
		
		if(m1==-1) {
			System.out.println("No need to print marksheet");
		}
		else {
			System.out.println("Print the marksheet for ");
		}
	}

}
