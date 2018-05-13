package aaaa_Program_Package;
public class ReverseString{

	public static void main(String[] args) {
		String s = "Manoj Kushwaha";
		String rev="";
	    for(int i=s.length()-1;i>=0;i--){
	    	rev=rev+s.charAt(i);
	    }
	    System.out.println(rev);
	    
	    System.out.println("********************************");
	    StringBuffer sb=new StringBuffer(s);
	    System.out.println(sb.reverse());
	}

}
