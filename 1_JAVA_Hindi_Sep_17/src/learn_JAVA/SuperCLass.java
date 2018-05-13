package learn_JAVA;

public class SuperCLass {
	public static void main(String[] args) {
	  B b=new B();
	  b.show();	
   }
}	
	
class A{
 public void show(){
	 System.out.println("A");
 }
}
class B extends A{
	public void show(){
		super.show();
		System.out.println("B");
	}
}