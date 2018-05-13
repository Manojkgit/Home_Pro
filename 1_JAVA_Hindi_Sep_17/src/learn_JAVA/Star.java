package learn_JAVA;

public class Star {

	public static void main(String[] args) {
		int n=6,k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<i;j++){
				System.out.print("* ");
			}System.out.println();
			
		}
	}

}
