package interviewPractise;

public class A_inString {

	public static void main(String[] args) {
		String s="manoj kushwaha test manavi ";
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='t'){
				count++;
				
			}		}
		if(count>0){
			System.out.println(count);
		}

	}

}
