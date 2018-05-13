package learn_JAVA;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=31;
		for(int i=2;i<=n;i++){
			boolean isP=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isP=false;
					break;
				}
			}if(isP){
				System.out.println(i);
			}
		}
	}

}
