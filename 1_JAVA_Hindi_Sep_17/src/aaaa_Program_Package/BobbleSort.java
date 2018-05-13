package aaaa_Program_Package;

public class BobbleSort {

	public static void main(String[] args) {
		int temp;
		int[] n={2,40,3,8,4,5,68,10,13};
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.println(n[i]+", ");
		}
		
		for(int j=n.length-1;j>=0;j--){
			System.out.print(n[j]+" ,");
		}
	}

}
