package zzzzzzz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class DeleteProgram {

	public static void main(String[] args) {
		/*String s[]={"A","A","S","s","h"};
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[i].equalsIgnoreCase(s[j])){
					System.out.println("Duplicate -- > " + s[i]);
				}
			}
		}
		
		Set<String> ss=new HashSet<String>();
		for(String name:s){
			if(ss.add(name)==false){
				System.out.println(name);
			}
		}
		
		int n[]={1,2,3,4,5,6,3,2,23,54};
		int la=n[0];
		int sm=n[0];
		
		for(int i=0;i<n.length;i++){
			if(n[i]>la){
				la=n[i];
			}else if(n[i]<sm){
				sm=n[i];
			}
		
		}System.out.println("large -- " +la);
		System.out.println("small -- " +sm);
		System.out.println("Arrays -- " +Arrays.toString(n));
		/*Set<Integer> ss=new HashSet<Integer>();
		for(Integer num:n){
			if(ss.add(num)==false){
				System.out.println(num);
			}
		}
		
	   String s="!@#$#@!manoj)(*&^%";
	   String newS=s.replaceAll("[^a-zA-Z0-9]", "");
	   System.out.println(newS);
		
		int[] n={1,2,3,4,6,7};
		int s=0,s1=0;
		for(int i=0;i<n.length;i++){
			s=s+n[i];
		}for(int i=0;i<=7;i++){
			s1=s1+i;
		}
		System.out.println(s1-s);
		
		
		String s="manoj";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		int n=12334;int reve=0;
		while(n!=0){
			reve=reve*10+n%10;
			n=n/10;
		}
		System.out.println(reve);
		
		System.out.println("******************");
		
		String num=String.valueOf(reve);
		StringBuffer sb1=new StringBuffer(num);
		System.out.println(sb1.reverse());
		
		
		// Reverse the Array Value -- 
		
		int n[]={1,2,3,4};
		for(int i=n.length-1;i>=0;i--){
			System.out.print(n[i]+", ");
		}
		
		Random r=new Random();
		for(int i=0;i<4;i++){
			int n1=r.nextInt(10);
			System.out.println(n1);
		}*/
		
		
		//Boblle Sort --- 
       /*int n[]={1,4,2,3,5,6,23,677,32,26};
       int temp=0;
       for(int i=0;i<n.length;i++){
    	   for(int j=i+1;j<n.length;j++){
    	   if(n[i]>n[j]){
    		   temp=n[i];
    		   n[i]=n[j];
    		   n[j]=temp;
    	   }
       }System.out.print(n[i]+", ");
     }*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number -- > ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum=sum+i;
			}
			
	}if(n==sum){
		System.out.println(n+" Parfact");
	}else{
		System.out.println("not");
	}
		
		
		
		
	}
}
