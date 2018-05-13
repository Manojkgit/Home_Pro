package interviewPractise;

import java.util.Scanner;

public class ArmStrongNumber_Home {

	public static void main(String[] args) {
        armStrong();
	}

	public static void armStrong(){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter--->");
	int n=s.nextInt();
	int r,temp,sum=0;
	temp=n;
	while(n!=0){
		r=n%10;
		sum=(r*r*r)+sum;
		n=n/10;
	}if(temp==sum){
		System.out.println("Number ArmStrong");
	}else{
		System.out.println("Not");
	}
  }
}
