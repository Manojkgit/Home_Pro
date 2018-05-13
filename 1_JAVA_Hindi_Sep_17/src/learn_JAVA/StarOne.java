package learn_JAVA;

public class StarOne {

	public static void main(String[] args) {
		//Fabonaci Serice;
		int n1=0,n2=1,n3;
		System.out.print(n1 +" "+n2 );
		for(int i=1;i<=10;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
		    n1=n2;
		    n2=n3;
		}
		System.out.println(" ");
		//factorial of 5;
		int fact =1;int number=5;
		for(int i=1;i<=number;i++){
		   fact=fact*i; 
		}System.out.println(fact);
		
		//Table of 20 /
		int t=20;
		for(int i=1;i<=10;i++){
			int table =t*i;
			System.out.print(table+" ");
		}
		System.out.println(" ");
		//All possible Prime number;
		int nn=31;
		for(int i=2;i<=nn;i++){
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}if(isPrime){
				System.out.print(i+ " ");
			}
		}
		System.out.println("  ");
		System.out.println("Palindrome Number ? -- ");
		
		int nnn=12321,temp,sum=0;
		temp=nnn;
		while(nnn>0){
			int r =nnn%10;
			sum=(sum*10)+r;
			nnn=nnn/10;
		}if(temp==sum){
			System.out.println(sum + " number is palindrome");
		}else{
			System.out.println("not palindrome");
		}
		
		
		
/*		int num =31;boolean isP=true;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				isP=false;
				break;
			}
		}if(isP){
				System.out.println("Prime");
			}else{
				System.out.println("not Prime");
			}	
		
		for(int i=1;i<6;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		int n=6,k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<i;j++){
				System.out.print("* ");
			}System.out.println();
		}*/
	}

}
