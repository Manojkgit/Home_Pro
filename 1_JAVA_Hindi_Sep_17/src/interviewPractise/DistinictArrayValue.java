package interviewPractise;

public class DistinictArrayValue {

	public static void main(String[] args) {
		int n[]={1,2,3,4,5,6,72,4,7,1,2};
		
		for(int i=0;i<n.length;i++){			
			boolean isDistinct=true;
			for(int j=0;j<i;j++){
				if(n[i]==n[j]){
					isDistinct=false;
					break;
				}
			}if(isDistinct){
				System.out.println(n[i]);
			}
		}
	}

}
