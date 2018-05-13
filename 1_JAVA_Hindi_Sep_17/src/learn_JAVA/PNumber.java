package learn_JAVA;

public class PNumber {

	public static void main(String[] args) {
		int n=31;
		for(int i=2;i<=n;i++){
			boolean isp=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isp=false;
					break;
				}
			}if(isp){
				System.out.println(i);
			}
		}	
		
	}

}
