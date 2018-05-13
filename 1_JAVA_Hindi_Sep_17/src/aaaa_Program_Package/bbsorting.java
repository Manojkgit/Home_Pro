package aaaa_Program_Package;

import java.util.Arrays;

public class bbsorting {

	public static void main(String[] args) {
		int[] n={3,2,346,23,4,78,63,6,8,1};
		int temp=0;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			
			System.out.print(n[i]+" ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(n));
		int small=  n[0];
		int large = n[0];
		for(int i=0;i<n.length;i++){
			if(n[i]<small){
		    	small=n[i];
		    }
		    else if(n[i]>large){
		    	large = n[i];
		    }
   	}
		System.out.println("Smallest -- " + small);
    	System.out.println("large -- " + large);
    
    	int maxOne=0;
        int maxTwo=0;
    	for(int num:n){
    		if(maxOne<num){
    			maxTwo=maxOne;
    			maxOne=num;
    		}else if(maxTwo<num){
    			maxTwo=num;
    		}
  	}
    	System.out.println("Max One -- " + maxOne);
		System.out.println("Max Two -- " + maxTwo);
	}
}
