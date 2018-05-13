package aaaa_Program_Package;

public class OutPut_Static_fun {

	public static void main(String[] args) {
		int i=2;
		f1(1);
	}
	
	public static void f1(int i){
		f2(i+1);
	}
	public static void f2(int i){
		f3(i+2);
	}
	public static void f3(int i){
		System.out.println(i+3);
	}
}
