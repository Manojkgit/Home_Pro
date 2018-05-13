package aaaa_Program_Package;

public class CompairDuplicateNumbeInArray {

	public static void main(String[] args) {
		int[] n={30,2,5,6,21,4,1};
		int[] n1={4,5,2,7,3,1,21,9};
		
		for(int i=0;i<n.length;i++){
			for(int j=0;j<n1.length;j++){
				if(n[i]==n1[j]){
					System.out.println(n[i]);
				}
			}
	}
	}
}
