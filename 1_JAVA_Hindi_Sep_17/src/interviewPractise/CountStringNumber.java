package interviewPractise;

public class CountStringNumber {

	public static void main(String[] args) {
		String s="manoj kushwaha manavi Testing";
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++){
			int count=0;
			for(int j=0;j<c.length;j++){
				if(c[i]==c[j])
					if(i==s.indexOf(c[j])){
						count++;
					}
			}if(count>0){
				System.out.println(c[i]+" "+count);
			}
			
		}
	}

}
