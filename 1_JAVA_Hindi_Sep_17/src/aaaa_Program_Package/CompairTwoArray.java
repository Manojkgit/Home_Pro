package aaaa_Program_Package;

public class CompairTwoArray {

	public static void main(String[] args) {
		int[] n1={2,4,3,8,4,5,68,10,13};
		int[] n2={8,4,5,2,10,8};
		for(int i=0;i<n1.length;i++){
			for(int j=0;j<n2.length;j++){
				if(n1[i]==n2[j]){
					System.out.print(n1[i]+", ");	
			}
		}
	}
   }
}
