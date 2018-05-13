package interviewPractise;

public class MissingNumber {

	public static void main(String[] args) {
		int n[]={1,2,3,5};
		int sum=0,sum1=0;
		for(int i=0;i<n.length;i++){
			sum=sum+n[i];
		}
		for(int i=0;i<=5;i++){
			sum1=sum1+i;
		}
		System.out.println(sum1-sum);
	}

}
