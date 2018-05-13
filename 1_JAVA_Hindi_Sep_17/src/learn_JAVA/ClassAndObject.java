package learn_JAVA;

public class ClassAndObject {
	
	int x; // instance Variable
	static int y; // static member variable
	private int p;
	public void fun(){
		p=10;
		System.out.println(p);
		//static String Ab;   -- Wrong
		//instance member function
		x=18;
	}
    
	public static void fun1(){
		y=19;
		//x=25; // --Wrong 
		//static int z; --Wrong
		//static member function
	}

	static class staticClass{
		
		public void static_Class_Method(){
			System.out.println("Static Class but method not Static");
		}
		
		public static void static_Member_Method(){
			System.out.println("Static Class and Static member method");
		}
	}

	public static void main(String[] a){
		ClassAndObject obj = new ClassAndObject();
		obj.x=15;
		y=20;
		obj.y= 324;
		System.out.println(obj.x + y);
		fun1();
		obj.fun();
		staticClass.static_Member_Method();
		staticClass sc = new staticClass();
		sc.static_Class_Method();
		
	}
}
