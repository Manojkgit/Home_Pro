package learn_JAVA;

public class Polimorphism {

	public static void main(String[] args) {
		C1 c = new C1();
		c.m2();
		System.out.println("---------");
		c.m1();
	}

	
	public void m1(){
		System.out.println("P m1");
	}
}


class C1 extends Polimorphism{
	public void m1(){
		System.out.println("C m1");
	}
	
	public void m2(){
		System.out.println("C m2");
	}
}