package aaaa_Program_Package;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=1234, rev=0;
		/*String s="!@# manoj K ^&*)(%$#";
		s=s.replaceAll("[^a-zA-Z0-9%]", "");
		System.out.println(s);
		while(n>0){
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}*/
		//System.out.println(rev);
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		System.out.println(sb.reverse());
	}

}
