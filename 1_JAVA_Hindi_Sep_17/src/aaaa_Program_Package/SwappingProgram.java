package aaaa_Program_Package;

import java.util.Scanner;

public class SwappingProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter--> ");
		/*int a=sc.nextInt();
		int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;*/
		
		String a=sc.nextLine();
		String b=sc.nextLine();
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
        System.out.println(a+ "    "+b);
        
        /*int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	*/
	}

}
