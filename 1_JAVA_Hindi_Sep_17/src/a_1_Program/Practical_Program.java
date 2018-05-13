package a_1_Program;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Practical_Program {
	@Test
	public void test(){
        max();
		max_Min_Value();
		max1_max2();
	}
	public void max_Min_Value(){
		int n[] ={1,4,2,45,62,45,7,67,34,67,8};
		int s=n[0];
		int l=n[0];
		for(int i=0;i<n.length;i++){			
			if(n[i]<s){
			    s=n[i];	
			}else if(n[i]>l){
				l=n[i];
			}
		}
		System.out.println(l);
		System.out.println(s);
	}
	
	public void max1_max2(){
		int n[] ={2,45,62,45,7,67,34,8};
		int max1=0;
		int max2=0;
		for(int i=0;i<n.length;i++){
			if(max1<n[i]){
				max2=max1;
				max1=n[i];		
			}
			else if(max2<n[i]){
				max2=n[i];
			}
		}
		System.out.println(max1+"  "+max2);
	}
	
	public void max(){
		int n[] ={2,45,62,45,7,67,34,8};
		int temp=0;
	for(int i=0;i<n.length;i++){
		for(int j=i+1;j<n.length;j++){
			if(n[i]>n[j]){
				temp=n[i];
			    n[i]=n[j];
				n[j]=temp;
				
			}
			
		}
		System.out.print(n[i]+",");
	}
 }
}