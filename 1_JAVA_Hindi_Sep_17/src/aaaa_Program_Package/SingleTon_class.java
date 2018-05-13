package aaaa_Program_Package;

public class SingleTon_class {

	public static void main(String[] args) {
        Test1 t1=Test1.gettestMethod();
        Test1 t2=Test1.getTest();
	}

}

class Test1{
	private static final Test1 t=new Test1();
	private Test1(){
		System.out.println("Test Method...");
	}
	
	public static Test1 gettestMethod(){
		return t;
	}
	public static Test1 getTest(){
		return t;
	}	

}
  
