package aaaa_Program_Package;

public class PatternMatching {

	public static void main(String[] args) {
		int n=8;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j +" ");
				
			}for(int j=i-1;j>=1;j--){
				System.out.print(j+" ");
			}System.out.println();
		}
		
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}System.out.println();
		}
		int k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		
		
		System.out.println("***********************************");
		System.out.println();
		
		int n1=8,k1=2*n1-2;
		for(int i=1;i<n1;i++){
			for(int j=1;j<=k1;j++){
				System.out.print(" ");
			}k1=k1-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
