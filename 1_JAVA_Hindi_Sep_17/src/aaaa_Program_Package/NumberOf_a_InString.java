package aaaa_Program_Package;

public class NumberOf_a_InString {

	public static void main(String[] args) {
		String s="manavi manoj sarita";
		int count=0; String sss="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				count++;
			}
		}System.out.println("Number of A --- > "+count);
		
		
		int le=s.length();
		System.out.println(le);
		for(int i=le-1;i>=12;i--){
			System.out.println(s.charAt(i));
		}
        for(int i=0;i<13;i++){
		   
           System.out.print(s.charAt(i));
	   }
	}
}
