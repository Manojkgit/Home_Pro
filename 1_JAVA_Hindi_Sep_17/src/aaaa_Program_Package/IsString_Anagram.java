package aaaa_Program_Package;

import java.util.Arrays;

public class IsString_Anagram {

	public static void main(String[] args) {
		anagram_String("sarita", "Ri tasa");
	}
	
	public static void anagram_String(String s1,String s2){
		String s11=s1.replaceAll("\\s", "");
		String s22=s2.replaceAll("\\s", "");
		boolean status=true;
		if(s11.length()!=s22.length()){
			status=false;
			System.out.println("Not Anagram");
		}
		else{
			char[] ArraysS1=s11.toLowerCase().toCharArray();
			char[] ArraysS2=s22.toLowerCase().toCharArray();
			Arrays.sort(ArraysS1);
			Arrays.sort(ArraysS2);
		    status = Arrays.equals(ArraysS1, ArraysS2);			
		}
		if(status){
				System.out.println("Anagram");	
			}else{
				System.out.println("Not");
			}
		}
}
