package interviewPractise;

import java.util.Scanner;

public class IsNumberPrime {

	public static void main(String[] args) {
		isPrime(17);
	    isPrimePrint(17);
	}

	
	public static void isPrime(int n){
		boolean is=true;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				is=false;
				break;
			}
		}if(is){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}
	
	public static void isPrimePrint(int n){
		
		for(int i=2;i<=n;i++){
			boolean is=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					is=false;
					break;	
				}
			} if(is){
				System.out.println(i);
			}
	}
  }
}
