package abstractPackage;

public class MainClass extends AbstractClass{

	public static void main(String[] args) {
	   MainClass ab=new MainClass();
	   ab.m1();
	   ab.m2();
	   ab.m4_main();
	}

	public void m2() {
		System.out.println("M2");
	}

	@Override
	public void m1() {
		System.out.println("M1");

	}
   
	public void m4_main(){
		System.out.println("main method M4");
	}
}
