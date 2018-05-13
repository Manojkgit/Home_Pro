package aaaa_Program_Package;

import java.util.Arrays;

public class AnagramPro {

	public static void main(String[] args) {
		isAnagram_String("sarita", "srita a");
	}
	
	public static void isAnagram_String(String s1,String s2){
		String ss1=s1.replaceAll("\\s", "");
		String ss2=s2.replaceAll("\\s", "");
		boolean status=true;
		if(ss1.length()!=ss2.length()){
			System.out.println("Not Anagram");
			status=false;
		}else{
			char[] ArrayS1=s1.toLowerCase().toCharArray();
			char[] ArrayS2=s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
		if(status){
			System.out.println("Anagram");
		}else{
			System.out.println("Not");
		}
	}

}
