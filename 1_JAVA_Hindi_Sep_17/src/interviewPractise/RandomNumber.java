package interviewPractise;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<10;i++){
			int n=r.nextInt(15);
			System.out.println(n);
		 }
		int temp;
		int n[]={1,35,42,546,45,23,43};
		System.out.println(n.length);
		for(int i=n.length-1;i>=0;i--){
			System.out.print(n[i]+" ");
		}
		System.out.println("Arrays -- > " + Arrays.toString(n));
		for(int a=0;a<n.length;a++){
			for(int b=a+1;b<n.length;b++){
				if(n[a]>n[b]){
					temp=n[a];
					n[a]=n[b];
					n[b]=temp;
				}
			}System.out.println(n[a]);
		}
	}

}
