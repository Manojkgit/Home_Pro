package aaaa_Program_Package;

public class OverRiding extends OverRiding_Calling {

	public static void main(String[] args) {
		  OverRiding_Calling oc = new OverRiding_Calling();
		  oc.add(2, 3);
		  oc.add(1,3);
	      add(2,3,4);
	}
	
	public static void add(int a,int b,int c){
		System.out.println(a+b);
	}
}
