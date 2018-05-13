package aaaa_Program_Package;

public class SuperClass {

	public static void main(String[] args) {
        B b = new B();        		
	}

	
}	
 class A{
	 
 public A(){
	 System.out.println("Construnter class A");
 }
}

 class B extends A{
	 public B(){
		 System.out.println("Constructer class B");
	 }
 }