package aaaa_Program_Package;

import java.util.Scanner;

public class Reverse_number_Pro {

	public static void main(String[] args) {
		int n=1234;
		String num=String.valueOf(n);
		StringBuffer sb=new StringBuffer(num);
		System.out.println(sb.reverse());
		
		int rev=0;
		while(n>0){          
          rev=rev*10+n%10;
          n=n/10;          
		}
		System.out.println(rev);
		
	    reverse_String();	
	}
	
	public static void reverse_String(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String -- ");
		String text = s.nextLine();
		StringBuffer sb=new StringBuffer(text);
		System.out.println(sb.reverse());
		System.out.println();
		for(int i=text.length()-1;i>=0;i--){
			System.out.print(text.charAt(i));
		}
	}
	
	public static void Int_Array(){
		int n[] = {23,435,2,76,8,3,7,8};
		
	}
}
