package aaaa_Program_Package;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random ran=new Random();
		for(int i=0;i<10;i++){
			int n=ran.nextInt(100);
			System.out.println(n);
		}
	}

}
