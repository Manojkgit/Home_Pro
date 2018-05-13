package Encapsulation_Test;

class Star {

	public static void main(String[] args) {
	    
		int n=1231,temp,sum=0;
		temp=n;
		while(n>0){
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}if(temp==sum){
			System.out.println(sum  + " Number is Palindrome");	
		}else{
			System.out.println("Number is not palindrome");
		}
		star();
	}
	public static void star(){
	int n1=6,k=2*n1-2;
	for(int i=1;i<=n1;i++){
		for(int j=1;j<=k;j++){
			System.out.print(" ");
		}k=k-1;
		for(int j=1;j<=i;j++){
			System.out.print("* ");
		}System.out.println();
	}
  }
}
