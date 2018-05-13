package learn_JAVA;

public class PrimeNumberFund {

	public static void main(String[] args) {
		int n=30;
		for(int i=2;i<=n;i++){
			boolean isP=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isP=false;
					break;	
				}
		}if(isP){
			System.out.print(i + " ");
		}
	}
		System.out.println("");
		boolean isP = true;
	    for(int i=2;i<n/2;i++){
	   	 if(n%i==0){
		   isP=false;
			 break;
			 }
	       }
	 if(isP){
			 System.out.println("Prime");
		 }else{
			 System.out.println("Not");
		 }
    }
}
