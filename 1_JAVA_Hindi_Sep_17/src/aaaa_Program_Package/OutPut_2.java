package aaaa_Program_Package;

public class OutPut_2 {

	public static void main(String[] args) {
		String a1[] =new String[3];
		String a2[] =new String[3];
		a1[0]="A";
		a1[1]="B";
		a1[2]="C";
		System.out.println(a1[2]);
		
		a2[0]="1";
		a2[1]="2";
		a2[2]="3";
		
		printA(a2);
		printA(a1);
	}
	
	public static void printA(String str[]){
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
