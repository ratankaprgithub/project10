package p1;

public class Test10 {

	void fun1(){
		System.out.println("inside fun1 of Test10");
	}
	
	public static void main(String[] args) {

		System.out.println("start of main...");
		
		new Test10().fun1();
		
		System.out.println("End of Main...");

	}

}
