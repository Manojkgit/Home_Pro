package aaaa_Program_Package;

public class MissingNumber {

	public static void main(String[] args) {
		int n[]={2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<n.length;i++){
			sum=sum+n[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=1;i<=9;i++){
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		System.out.println("Missing Number is --- > " +(sum1-sum));
	}

}
