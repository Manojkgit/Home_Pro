package aaaa_Program_Package;

public class Super_Refrence_Variable {

	public static void main(String[] args) {
	    child_class c=new child_class();
	    
	    c.calling();
        c.parentMethod();
        
	}
	
	

}

class parentt{
	int i=10;
	public parentt(){
		System.out.println("Parent");
	} 
	public void parentMethod(){
		System.out.println("Parent Method");
	}
}

class child_class extends parentt{
	int i=20;
   public child_class(){
	   
	   System.out.println("child");
   }
	
public void calling(){
	
	System.out.println("Child "+ i );
    System.out.println(super.i);
}

public void parentMethod(){
    super.parentMethod();	
	System.out.println("Child Method");
}

}