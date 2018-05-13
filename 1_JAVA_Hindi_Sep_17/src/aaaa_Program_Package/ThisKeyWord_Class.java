package aaaa_Program_Package;

public class ThisKeyWord_Class {
	static int count=0;
	{
		count++;
	}

	public ThisKeyWord_Class(){
		
		System.out.println("No argument constructer...");
	}
	
	public ThisKeyWord_Class(int i){
		
		//this(12,1);
		
		System.out.println("1 argument constructer...");
	}
	
	public ThisKeyWord_Class(int i,int j){
		//this();
		//count++;
		System.out.println("2 argument constructer...");
	}
	
	public static void main(String[] args) {
		ThisKeyWord_Class thisKey = new ThisKeyWord_Class();
		ThisKeyWord_Class thisKey1 = new ThisKeyWord_Class(10);
		ThisKeyWord_Class thisKey2 = new ThisKeyWord_Class(2,3);
		System.out.println(count);
		
	}

}
