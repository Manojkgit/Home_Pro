package a_1_Program;

public class BobbleSorting {

	public static void main(String[] args) {
		int[] n={2,4,2,5,1,65,324,3,-2};
		int temp=0;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]> n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.print(n[i]+"    ");
		}
	}

}
