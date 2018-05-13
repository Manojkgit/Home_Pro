package aaaa_Program_Package;

public class StaticBlock {

	static 
	{
		System.out.println("Static 2");
	}
	
	public static void main(String[] args) {
	  System.out.println("Main method...");	
  
	}
	
	static{
		System.out.println("Hello Static block call by default...");
	    int i=2;int j=4;
	    int k=i*j; 
	    System.out.println(k);
	}
	

}
