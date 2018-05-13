package interviewPractise;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter -- > " );
		int num=sc.nextInt();
		int r,temp,sum=0;
		temp=num;
		while(num!=0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}if(temp==sum){
			System.out.println("Palindrom");
		}else{
			System.out.println("Not");
		}
	}

}
