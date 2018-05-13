package aaaa_Program_Package;

public class DistinctArrayValue {

	public static void main(String[] args) {
		int[] d={1,21,2,1,21,3,34};
		for(int i=0;i<d.length;i++){
			boolean isD=true;
			for(int j=0;j<i;j++){
				if(d[i]==d[j]){
					isD=false;
					break;
				}
			}if(isD){
				System.out.println(d[i]);
			}
		}
	}

}
