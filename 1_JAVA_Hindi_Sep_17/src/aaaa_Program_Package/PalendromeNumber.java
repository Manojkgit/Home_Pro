package aaaa_Program_Package;

public class PalendromeNumber {

	public static void main(String[] args) {
		int temp,n=12321,sum=0;
		temp=n;
		while(n>0){
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.print("Number is Palendrome... " + sum);
		}else{
			System.out.println("Number is not Palendrome --- " + sum);
		}
		
		
	}

}
