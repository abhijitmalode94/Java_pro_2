package FunctionsAndReturnKeywords;

public class Testing {
	
	public int getStudentMark(String studentname) {
		System.out.println("Getting student mark for :"+studentname);
		
		int mark=-1;
		
		if(studentname.equals("Karan")) {
			//return 100;
			mark=100;
		}else if(studentname.equals("Abhi")) {
			//return 90;
			mark=90;
			
		}
		else {
			System.out.println("Student name not found :"+studentname);
			//return-1
		}
		return mark;
	}
	
	public boolean launchBrower(String browsername) {
		System.out.println("Lauching the browser "+browsername);
		boolean flag=true;
		switch (browsername) {
		case "Chrome":
			System.out.println("Chrome is launched");
			flag=true;
			break;
			
		case "Firefox":
			System.out.println("Firefox is launched");
			flag=true;
			break;
			
		case "Safari":
			System.out.println("Safari is launched");
			flag=true;
			break;

		default:
			System.out.println("Browser  not found");
			flag=false;
			break;
		}
		return flag;
	}
		
		
		
	
	
			public String getname() {
				return"Abhijit";
			}
			
			public int getnumber() {
				return 500;
				
			}

	public static void main(String[] args) {
		Testing obj=new Testing();
		
		int studentmark=obj.getStudentMark("Abhi");
		
		System.out.println(studentmark);
		
		
		if(obj.launchBrower("Chrome")) {
			System.out.println("Launched the browser");
		}
		else {
			System.out.println("No need to enter the URL");
		}
		
		

	}

}
