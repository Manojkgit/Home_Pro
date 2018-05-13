package interviewPractise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter -- > " );
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				sum=sum+i;	
			}//14+7+4+2+1=28 --Perfect
			
		}if(num==sum){
			System.out.println("Parfect");
		}else{
			System.out.println("Not");
		}
	}

}
