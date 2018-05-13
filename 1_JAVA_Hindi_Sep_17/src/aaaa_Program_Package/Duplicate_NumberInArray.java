package aaaa_Program_Package;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_NumberInArray {

	public static void main(String[] args) {
		 int n[]={2,4,7,7,3,2};
		 for(int i=0;i<n.length;i++){
			 for(int j=i+1;j<n.length;j++){
				 if(n[i]==n[j]){
					 System.out.println("Duplicate number ----> "+ n[i]);
				 }
			 }
		 }
		System.out.println("************************************"); 
		 Set<Integer> store=new HashSet<Integer>();
		 for(Integer num:n){
			 if(store.add(num)==false){
				 System.out.println("Duplicate ----> " + num);
			 }
		 }
	}

}
