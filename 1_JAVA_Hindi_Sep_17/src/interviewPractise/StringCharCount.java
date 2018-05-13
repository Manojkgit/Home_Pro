package interviewPractise;

public class StringCharCount {

	public static void main(String[] args) {
		String s="manavi manoj sarita suman";
	    
	    char[] n=s.toCharArray();
	    for(int i=0;i<n.length;i++){
	    	int c=0;
	    	for(int j=0;j<n.length;j++){
	    		if(n[i]==n[j]){
	    			if(i==s.indexOf(n[j])){
	    				c++;
	    			}
	    		}
	    	}if(c>0){
    			System.out.println("Number of Element -- > " + n[i] + "  "+c);
    		}
	    }
	}

}
