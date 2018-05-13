package aaaa_Program_Package;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Number -- > ");
	   int n=sc.nextInt();
	   switch (n){
	   case 1:
		   System.out.println("One");
		   break;
	   case 2:
		   System.out.println("Two");
		   //break;
		   
	   case 10:
		   System.out.println("Ten");
		   break;
	   case 12:
		   System.out.println("Twelve");
		   //break;
		default :
			System.out.println("No number match");
	   }
	   
	}

}
