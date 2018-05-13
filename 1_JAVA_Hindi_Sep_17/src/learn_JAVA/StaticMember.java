package learn_JAVA;

public class StaticMember {

	public static void main(String[] args) {
        //Child c=new Child();        
        System.out.println(Child.x);    
	}

}

class Parent{
	static int x=10;
	    //public static void parentFun(){
    	//System.out.println("Parent Fun..");
    }

class Child extends Parent{
    static int x;
	static{
    	x=20;
    }
}