package aaaa_Program_Package;

public class TestClass {
	public static void main(String[] args) {
		//TestClass t=new TestClass();
	}
	
	public void m(String a){
		System.out.println("Animal");
	}
	
	public void m(StringBuffer m){
		System.out.println("Monkey");
	}
	
	class Animal{
		public void ani(){
			System.out.println("animal");
		}
	}
	
	class monkey extends Animal{
		public void mon(){
			System.out.println("mon");
		}
	}
}
