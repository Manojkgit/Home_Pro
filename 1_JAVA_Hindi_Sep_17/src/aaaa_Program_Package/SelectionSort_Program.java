package aaaa_Program_Package;

public class SelectionSort_Program {

	public static void main(String[] args) {
		int[] n={30,2,5,6,21,4,1};
		int temp=0;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.println(n[i]);
		}
	}

}
