package aaaa_Program_Package;

public class S {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		
		for(int i=4;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		int k=2*6-2;
		for(int i=0;i<=6;i++){
			for(int j=0;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
	
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}System.out.println(" ");
		}
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}System.out.println(" ");
		}
	
	}
	
	

}
