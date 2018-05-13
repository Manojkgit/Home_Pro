package interviewPractise;

public class TwoArraysCompair {

	public static void main(String[] args) {
		int n1[]={1,43,5,36,4,2,6,64,3,6,8};
		int n2[]={1,3,36,6,40,2,6,6,32,66,8};
		for(int i=0;i<n1.length;i++){
			for(int j=0;j<n2.length;j++){
               if(n1[i]==n2[j]){
            	   System.out.println(n1[i]);   
               }
			}
		}
	}
}
