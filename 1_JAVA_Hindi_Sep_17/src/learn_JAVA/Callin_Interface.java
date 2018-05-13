package learn_JAVA;

public class Callin_Interface implements Interface_3{

	public void show(){
		System.out.println("show");

	}
	
	public void display(){
		System.out.println("display");
	}
	
	public static void main(String[] args){
		Callin_Interface i = new Callin_Interface();
		i.display();
		i.show();
		System.out.println(i.x);
		
	}

	@Override
	public void I4() {
		System.out.println("I4");
	}

	@Override
	public void I5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void i2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void i3() {
		// TODO Auto-generated method stub
		
	}
}