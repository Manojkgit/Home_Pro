package aaaa_Program_Package;

import java.util.Arrays;

public class ReverseIntArray {

	public static void main(String[] args) {
		int n[]={2,3,4,6,7,3,6,8};
		for(int i=n.length-1;i>=0;i--){
			System.out.print(n[i]+" , ");
		}
		System.out.println("Arrays-- > " +Arrays.toString(n));
	}

}
