package interviewPractise;

public class AlternetStringChar {

	public static void main(String[] args) {
		String s="manoj kushwaha Manavi Sarita";
		int count=0;
		for(int i=0;i<s.length();i+=2){
			System.out.println(s.charAt(i));
			if(s.charAt(i)=='a'){
				count++;
			}
		}if(count>0){
			System.out.println("Number of A is --> " + count);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	    System.out.println(s.length());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	    for(int i=0;i<s.length();i+=2){	    	
	    	count++;
	    	System.out.println(s.charAt(i));
	    }if(count>0){
	    	System.out.println(count);
	    }
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	    int n[]={1,3,2,43,5,56,23,6,8};
	    for(int i=0;i<n.length;i+=2){
	    	System.out.println(n[i]);
	    }
	}
}
