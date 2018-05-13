package interviewPractise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArrays {

	public static void main(String[] args) {
		int n[]={2,4,3,5,3,5,37,2};
		Set<Integer> store=new HashSet<Integer>();
		for(Integer num:n){
			if(store.add(num)==false){
				System.out.println("Duplicate -- " + num);
			}
		}
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]==n[j]){
					System.out.println("Duplicate --- > " + n[i]);
				}
			}
		}
		
	}

}
