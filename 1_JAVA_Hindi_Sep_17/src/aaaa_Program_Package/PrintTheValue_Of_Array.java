package aaaa_Program_Package;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintTheValue_Of_Array {

	public static void main(String[] args) {
		
		int nu[]={1,3,4,5,6,72,32,-32,4};
		int large=nu[0];
		int small=nu[0];
		for(int i=0;i<nu.length;i++){
			if(nu[i]>large){
				large=nu[i];
			}else if(nu[i]<small){
				small=nu[i];
			}
			
		}System.out.println("large -- > " + large);
		System.out.println("Small -- > " + small);
		System.out.println("Arrays -->" + Arrays.toString(nu));
		
	
		int duplicate[] ={1,2,3,4,2,3,5};
		Set<Integer> store = new HashSet<Integer>();
		for(Integer num:duplicate){
			if(store.add(num)==false){
				System.out.println("Duplicate Number -- > "+num);
			}else{
				System.out.println("Unique Number --- > " + num);
			}
		}
		
		int[] n={1,2,3,4,6,7,8};
		for(int i=0;i<n.length;i++){
			System.out.print(n[i] + " , ");
		}
		System.out.println("Arrays -- > " + Arrays.toString(n));
	  
		int l=n.length;
		for(int i=l-1;i>=0;i--){
			System.out.print(n[i]+",");
		}
		System.out.println("+++++++++++++++++++++++++++");
		String s="manoj";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		System.out.println("+++++++++++++++++++++++++++");
		String rev="";
		int l1=s.length();
		for(int i=l1-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}System.out.println(rev);
	 
	
	}

}
