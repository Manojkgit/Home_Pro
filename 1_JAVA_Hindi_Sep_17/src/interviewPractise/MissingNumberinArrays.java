package interviewPractise;

public class MissingNumberinArrays {

	public static void main(String[] args) {
		int n[]={1,2,3,4,5,7};
		int sum=0,sum1=0;
		for(int i=0;i<n.length;i++){
				sum=sum+n[i];
			}
			for(int i=0;i<=7;i++){
				sum1=sum1+i;
		}System.out.println(sum1-sum);
	}

}
