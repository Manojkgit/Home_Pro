package learn_JAVA;

public class This_And_Super {

	public static void main(String[] args) {
		BB b=new BB();
	}
}

class AAA{
	public AAA(){		
		this(10);
		System.out.println("Parent Constructor... ");
	}
	
	public AAA(int i){
		
		this(1,2);
		System.out.println("1 argument");
	}
	
	public AAA(int a,int b){
		super();
		System.out.println("1 argument");
	}
}

class BB extends AAA{
	public BB(){
		System.out.println("Child Cunstructor... ");
	}
}
