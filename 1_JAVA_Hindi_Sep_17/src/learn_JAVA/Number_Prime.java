package learn_JAVA;

public class Number_Prime {

	public static void main(String[] args) {
		boolean is=true;int n=30;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				is=false;
				break;
			}
		}if(is){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}

}
