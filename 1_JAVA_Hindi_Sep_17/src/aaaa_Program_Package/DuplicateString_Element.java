package aaaa_Program_Package;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString_Element {

	public static void main(String[] args) {
		String s[]={"javascript","java", "c","c"};
		Set<String> store = new HashSet<String>();
		for(String name : s){
			if(store.add(name)==false){
				System.out.println("Duplicate -- > " + name);
			}
		}
	System.out.println("************************");
	System.out.println();
	for(int i=0;i<s.length;i++){
		for(int j=i+1;j<s.length;j++){
			if(s[i].equalsIgnoreCase(s[j])){
				System.out.println("Duplicate -- >  "+ s[i]);
			}
		}
	}
	}
}
