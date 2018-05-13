package aaaa_Program_Package;

public class SelectionSort_Pro {

	public static void main(String[] args) {
		int n[] ={3,4,2,5,-2,1,15};

		for(int i=0;i<n.length;i++){
			int index=i;
			for(int j=i+1;j<n.length;j++){
				if(n[j]<n[index]){
					index=j;
				}
			}
			int smallNum=n[index];
			n[index]=n[i];
			n[i]=smallNum;
			System.out.println(n[i]);
		}
		System.out.println("*******************");
		distinctNumberInArray();
		System.out.println(" +++++++++++++++++++ ");
		primeNumber();

		System.out.println(" +++++++++++++++++++ ");
		PerfectNumber();
		
		
		System.out.println();
		System.out.println();
		System.out.println("_(((((((((((((((((((((((((((((((((((_");
		selectionSort();
	}


	public static void distinctNumberInArray(){
		int n1[] ={32,4,2,5,2,1,12,4};

		for(int i=0;i<n1.length;i++){
			boolean isD=true;
			for(int j=0;j<i;j++){
				if(n1[i]==n1[j]){
					isD=false;
					break;
				}
			}if(isD){
				System.out.println(n1[i]);
			}
		}
	}

	public static void primeNumber(){
		int n=31;
		for(int i=2;i<=n;i++){
			boolean isP=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isP=false;
					break;
				}
			}if(isP){
				System.out.println(i);
			}
		}
	}

	public static void PerfectNumber(){
		int n=28;int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum=sum+i;
			}

		}System.out.println("Perfact Number");
	}
	
	
	public static void selectionSort(){
	    int n[] ={32,12,21,1,2,3,4,-2,12};
	   for(int i=0;i<n.length;i++){
	  int index=i;
	      for(int j=i+1;j<n.length;j++){
	           if(n[j]<n[index]){
	           index=j;            
	} 
	       }
	    int smallNum=n[index];
		n[index]=n[i];
		n[i]=smallNum;
		System.out.println(n[i]);
	   }
	   
	}
}
