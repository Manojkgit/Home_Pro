package aaaa_Program_Package;

import java.util.Arrays;

public class AnagramStringPro {

	public static void main(String[] args) {
		IsAnagram("Manoj", "nojma");
	}
	
	public static void IsAnagram(String s1,String s2){
		//String ss1=s1.replaceAll("\\s", "");
		//String ss2=s2.replaceAll("\\s", "");
		boolean status =true;
		if(s1.length()!=s2.length()){
			status=false;
			System.out.println("Not Anagram");
		}else{
			char[] ArraysS1=  s1.toLowerCase().toCharArray();
			char[] ArraysS2=  s2.toLowerCase().toCharArray();
			Arrays.sort(ArraysS1);
			Arrays.sort(ArraysS2);
            status=Arrays.equals(ArraysS1, ArraysS2);
		}
		
		if(status){
			System.out.println("Anagram");
		}else{
			System.out.println("Not");
		}
	}

}
