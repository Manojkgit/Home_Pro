package aaaa_Program_Package;

import java.util.Arrays;

public class largeSmall_Number {

	public static void main(String[] args) {
		int[] n={2,3,4,5};
		int l=n[0];
		int s=n[0];
		for(int i=0;i<n.length;i++){
			if(n[i]>l){
				l=n[i];
				//System.out.println(l);
			}else if(n[i]<s){
				s=n[i];
			}
		}System.out.println(l);
		System.out.println(s);
		System.out.println("Array -- > " + Arrays.toString(n));
	}

}
