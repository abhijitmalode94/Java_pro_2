package Method_overriding_Concept;

public class TestOnePlus {
	
	public static void main(String[]args) {
		
		OnePlus op=new OnePlus();
		
		//Overridemethod
		op.start();
		op.switchOff();
		
		//Individulas method
		op.tripleCamera();
		op.cTypeCharger();
		
		// inheritated method
		op.foldableDevice();
		
		
		op.andriod13();
		
		op.snapdragon625();
		
		op.touchscreen();
		
		System.out.println("---------------------");
		
	}

}
