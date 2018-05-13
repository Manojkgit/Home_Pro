package aaaa_Program_Package;

public class MethodOverriding {

	public static void main(String[] args) {
		parent p=new parent();
		p.property();
		p.marry();
		
		System.out.println("-----------------------");
        Child c=new Child();
        c.property();
        c.child_pro();
        c.marry();
        
        System.out.println("____________________________");
        
        parent pc=new Child();
        pc.marry();
        pc.parent_Method();
        pc.property();
        
	}
}



class parent{
	public static void property(){
		System.out.println("parent Pro");
	}
	
	public void marry(){
		System.out.println("parent marry");
	}
	
	public void parent_Method(){
		System.out.println("parent method");
	}
}
 
class Child extends parent{
	public void child_pro(){
		System.out.println("child Pro");
	}
	
	public void marry(){
		System.out.println("child Marry");	
	}
	public static void property(){
	System.out.println("Same child Pro");
	}
}

