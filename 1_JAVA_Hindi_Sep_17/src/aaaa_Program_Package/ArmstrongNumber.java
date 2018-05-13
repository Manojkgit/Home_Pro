package aaaa_Program_Package;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=371,sum=0,temp,r;
		temp=n;
		while(n>0){
		  r=n%10;
		  sum=(r*r*r)+sum;
		  n=n/10;
		}if(temp==sum){
			System.out.println("number is Armstrong");
		}else{
			System.out.println("NOT");
		}
	}

}
