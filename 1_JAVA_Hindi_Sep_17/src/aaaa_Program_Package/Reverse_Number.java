package aaaa_Program_Package;

public class Reverse_Number {

	public static void main(String[] args) {
		int n=1234;
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		System.out.println("***************************");
		
		int r=0;
		while(n!=0){
		r=r*10+n%10;
		n=n/10;
		}System.out.println(r);
	}

}
