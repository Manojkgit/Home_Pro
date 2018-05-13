package aaaa_Program_Package;

public class SwapStringWords {

	public static void main(String[] args) {
		String a="manoj";
		String b="sarita";
		
		a=a+b; // manojsarita
		System.out.println(a);
		b=a.substring(0,a.length()-b.length()); // manojsarita-sarita=manoj
		a=a.substring(b.length()); // manojsarita-manoj = sarita
		
		System.out.println(a+" "+b);
	}

}
