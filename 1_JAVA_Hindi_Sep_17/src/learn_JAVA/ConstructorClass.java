package learn_JAVA;

public class ConstructorClass {

	public static void main(String[] args) {
		ConstructorClass t = new ConstructorClass(); //Double Arrgument + Int Arrgument + No Arrgument 
		System.out.println("--------------");
		ConstructorClass t1 = new ConstructorClass(10);//Double Arrgument + Int Arrgument
		System.out.println("--------------");
		ConstructorClass t2 = new ConstructorClass(10.33);//Double Arrgument
		System.out.println("--------------");
		ConstructorClass t3 = new ConstructorClass(10l);//Double Arrgument
	}
	public ConstructorClass(){			
			this(10);
			System.out.println("No Arrgument");
			
		}	
    
	public ConstructorClass(int i){			
		this(10.5);
		System.out.println("Int Arrgument");			
		
	}

	public ConstructorClass(double d){			
		System.out.println("Double Arrgument");			
		
	}
}
