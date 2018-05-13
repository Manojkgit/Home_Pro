package interviewPractise;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BobbleSorting {
	@Test
	public void bobblesortPro(){
		int n[]={3,345,56,3,6,3,56,34,30};
		int temp;
		for(int i=0;i<n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i] > n[j]){
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}System.out.println(n[i]+" , "+Arrays.toString(n));
		}
	}
}
