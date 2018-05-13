package learn_JAVA;

public abstract class AbstractClass {
	public static void main(String[] args) {
         Ab_P abc=new Ab_c();
         abc.display();
         abc.implemented();
         abc.show();
         
	}
}

abstract class Ab_P{	
	abstract void show();
	abstract void display();
	public void implemented(){
		System.out.println("impl");
	}
}

class Ab_c extends Ab_P{
	public void display(){
		System.out.println("displaye ");
	}
	
	public void show(){
		System.out.println("show...");
	}
}
