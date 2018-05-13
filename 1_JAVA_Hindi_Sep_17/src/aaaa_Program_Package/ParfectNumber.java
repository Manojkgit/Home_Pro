package aaaa_Program_Package;

import java.util.Scanner;

public class ParfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ---- > ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				sum=sum+i;	
			}
		}if(num==sum){
			System.out.println(sum+" Number is Perfact");	
		}else{
			System.out.println("Not Parfact");
		}
		
	}

}
