package aaaa_Program_Package;

public class factoricOf10 {

	public static void main(String[] args) {
		int fact=1;
		for(int i=1;i<=6;i++){
			fact = fact*i;
		}System.out.println(fact);
	
		int n1=0,n2=1,n3;
		System.out.print(n1+ " " +n2);
		for(int i=1;i<=10;i++){
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
		System.out.println("");
		System.out.println("-----------------------------------");
		
		int n=6,k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("------------Palindrome number-----------------------");
	
		int n5=123231,temp,sum=0;
		temp=n5;
		while(n5>0){
			int r=n5%10;
			sum=(sum*10)+r;
			n5=n5/10;
		}if(temp==sum){
			System.out.println("PALINDROME");
		}else{
			System.out.println("Not palindrome");
		}
	
	
	
	}

}
