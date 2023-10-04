package Java_Basics;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser="chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "IE":
			System.out.println("IE is launched");
			break;
			
		case "MozolaFirefox":
			System.out.println("MozolaFirefox is launched");
			
			break;

		default:
			System.out.println("Please pass the invalid browser");
			break;
		}
			
			
			int marks=90;
			
			switch (marks) {
			case 90:
				System.out.println("A garde");
				break;
			case 80:
				System.out.println("b garde");
				break;
			case 60:
				System.out.println("c garde");
				break;
			case 35:
				System.out.println("d garde");
				break;
			
			default:
				System.out.println("enter the valid marks");

				break;
			}
			
			char arr='a';
			
			switch (arr) {
			case 'a':
				System.out.println("a is vowels");
				break;
			case 'e':
				System.out.println("e is vowels");
				break;
			case 'i':
				System.out.println("i is vowels");
				break;
				
			case 'o':
				System.out.println("o is vowels");
				break;
			case 'u':
				System.out.println("u is vowels");
				break;

			default:
				break;
			}
		}
	
	}


