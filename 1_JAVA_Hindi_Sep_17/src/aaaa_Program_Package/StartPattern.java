package aaaa_Program_Package;

public class StartPattern {

	public static void main(String[] args) {
	    int n=6; int k=2*n-2;
	    for(int i=0;i<=n;i++){
	    	for(int j=0;j<=k;j++){
	    		System.out.print(" ");
	    	}k=k-1;
	    	for(int j=0;j<i;j++){
	    		System.out.print("* ");
	    	}System.out.println();
	    }
	    
	    System.out.println("***************************************");
	    System.out.println(" ");
	    int nn=5;int kk=2*nn-2;
	    for(int i=0;i<=nn;i++){
	    	for(int j=0;j<=kk;j++){
	    		System.out.print(" ");
	    	}kk=kk-2;
	    	for(int j=0;j<i;j++){
	    		System.out.print("* ");
	    	}System.out.println();
	    }
	}

}
