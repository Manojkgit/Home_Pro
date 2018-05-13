package interviewPractise;

public class LargeSmall_Number {

	public static void main(String[] args) {
		int n[]={1,34,6,2,5,32,67,-3,3,78,2};
		int small=n[0];
		int large=n[0];
		for(int i=0;i<n.length;i++){
			if(n[i]>large){
				large=n[i];
			}else if(n[i]<small){
				small=n[i];
			}
		}
		System.out.println(small+"    "+large);
	}

}
