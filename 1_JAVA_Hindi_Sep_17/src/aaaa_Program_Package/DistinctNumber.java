package aaaa_Program_Package;

public class DistinctNumber {

	public static void main(String[] args) {
		int[] N={1,2,2,2,3,3,4,5,6,1,2,3,4,5,66,6,6,62,2,1};
		for(int i=0;i<N.length;i++){
			boolean isD=true;
			for(int j=0;j<i;j++){
				if(N[i]==N[j]){			
					isD=false;
					break;
				}
			}if(isD){
				System.out.println(N[i]);//+ count
			}
		}
	}

}
