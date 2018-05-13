package learn_JAVA;

public class InheritanceClass {

	public static void main(String[] args) {
		SC p=new SC();
		p.m1();
		p.m2();
		p.m3();
	}

}

class P{
	public void m1(){
		System.out.println("M1");
	}
}

class C extends P{
	public void m2(){
		System.out.println("M2");
	}
}

class SC extends C{
	public void m3(){
		System.out.println("M3");
	}
}
