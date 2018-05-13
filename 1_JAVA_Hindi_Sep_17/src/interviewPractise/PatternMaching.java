package interviewPractise;

public class PatternMaching {

	public static void main(String[] args) {
      for(int i=1;i<=9;i++){
    	  for(int j=1;j<=i;j++){
    		  System.out.print(j);
    	  }System.out.println();
      }
      for(int i=8;i>=1;i--){
    	  for(int j=1;j<=i;j++){
    		  System.out.print(j);
    	  }System.out.println();
      }
      
      int n=7,k=2*n-1;
      for(int i=0;i<n;i++){
    	  for(int j=0;j<i;j++){
    		  System.out.print(" ");
    	  }System.out.println();
    	  
      }k=k-1;
      for(int j=1;j<=k;j++){
    	  System.out.println(" *");
      }
      
	}

}
