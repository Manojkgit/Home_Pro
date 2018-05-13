package interviewPractise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		int n[]={1,3,5,5432,732,6,2,5,7};
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]==n[j]){
					System.out.println(n[i]+" Number is Duplicate");
				}
			}
		}
		
		Set<Integer> store=new HashSet<Integer>();
		for(int num:n){
			if(store.add(num)==false){
				System.out.println(num+" Duplicate number");
			}
		}
	}

}
