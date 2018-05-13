package learn_JAVA;
public class StarPattern {
	public static void main(String[] args) {
		int x= -2147483648;
		System.out.println("X -- " + x);
		byte b = 127;
		byte b1 = -128;
		
		 
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+ " ");
			}System.out.println();
		}
	  for(int i=8;i>=1;i--){
		  for(int j=1;j<=i;j++){
			  System.out.print(i+" ");
		  }System.out.println();
	  }
	  System.out.println("  --------  ");
	  int k=2*6-2;
	  for(int i=1;i<=6;i++){
		  for(int j=1;j<=k;j++){
			  System.out.print(" ");
		  }k=k-1;
		  for(int j=1;j<=i;j++){
			  System.out.print(i + " ");
		  }System.out.println();
	  }
	  System.out.println("-------------------------");
	  System.out.println("   ");
	  for(int i=6;i>=1;i--){
		  for(int j=i;j>=1;j--){
			  System.out.print(i+" ");
		  }System.out.println();
	  }
	  for(int i=1;i<=6;i++){
		  for(int j=1;j<=i;j++){
			  System.out.print(i+" ");
		  }System.out.println();
	  }
	}
}
