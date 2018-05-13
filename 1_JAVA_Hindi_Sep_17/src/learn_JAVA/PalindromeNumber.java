package learn_JAVA;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=12321;
		int temp,r,sum=0;
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("Palindrome.");
		}else{
			System.out.println("Not Palindrome");
		}
	System.out.println(" -----");
	System.out.println("   ");
	
	int n1=0,n2=1,n3;
	System.out.print(n1+" "+n2);
	for(int i=1;i<=10;i++){
	n3=n1+n2;
	System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}}
}
