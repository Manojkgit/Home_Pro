package interviewPractise;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {

	public static void main(String[] args) {
		String s[]={"a","a","b","c","b"};
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[i]==s[j]){
					System.out.println(s[i]+" Duplicate");
				}
			}
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Set<String> store=new HashSet<String>();
		for(String ss:s){
			if(store.add(ss)==false){
			System.out.println(ss+" Duplicate");
		}
	  }
	}

}
