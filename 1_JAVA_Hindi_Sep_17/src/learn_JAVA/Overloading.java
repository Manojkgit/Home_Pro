package learn_JAVA;

public class Overloading {

	public static void main(String[] args) {
		PP p=new PP();
		p.m1();
		p.m1(214748347);
		p.m1(21.4748347f);
	    short s = 32767;	
	}
}

class PP{
	public void m1(){
		System.out.println("with out para");
	}
	/*public void m1(int i){
		System.out.println("with int parameter....");
	}
	byte --> short --> int --> long --> float --> double 
	char --> int --> long --> float --> double 
	*/
    
	public void m1(float f){
		System.out.println("with float parameter....");
	}
}
