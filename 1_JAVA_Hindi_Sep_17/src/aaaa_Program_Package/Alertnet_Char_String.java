package aaaa_Program_Package;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Alertnet_Char_String {
	public static void main(String[] args) {
		/*String s = "Manoj Kushwaha";
		for(int i=0;i<=s.length();i+=2){
			System.out.println(s.charAt(i));
		}*/
		
		String s1="manoj kushwaha sarita kushwaha";
		int count=0;
		for(int i=0;i<s1.length();i++){
			
			if(s1.charAt(i)=='a'){
				count++;
			}
		}
		    if(count>0){
			System.out.println("Duplicate Number - > " + count);
		}
	
		CompairString();
}
	
	public static void CompairString(){
		String ss="manoj kumar kushwaha Sarita";
		
		char[] c=ss.toCharArray();
		for(int i=0;i<c.length;i++){
			int count=0;
			for(int j=0;j<c.length;j++){
				if(c[i]==c[j]){
					if(i==ss.indexOf(c[j])){
						count++;
					}
				}
						
			}if(count>0){
				System.out.println(c[i]+" "+ count);
			}
		}
	}
	
	public static void isNumberArmStrong(){
		int n=371,temp,sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(r*r*r)+sum;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("Armstrong");
		}else{
			System.out.println("Not");
		}
	}
	
	public static void IsNumberPalindrom(){
		int n=1221,temp,sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("Palindrom");
		}else{
			System.out.println("Not");
		}
	}
	

   public static void DoBobble_Sorting(){
	   int[] a = {12,43,32,5,4,24,656,312};
	   int temp=0;
	   for(int i=0;i<a.length;i++){
		   for(int j=i+1;j<a.length;j++){
			   if(a[i]>a[j]){
			   temp=a[i];
			   a[i]=a[j];
			   a[j]= temp;
			   }
		   }
//		   System.out.print(a[i]+ " ");
	   }
	   System.out.println("Arrays ---- > " + Arrays.toString(a));
   }
   
   public static void DuplicateNumberCompair(){
	   String a[]={"1","a","1","c","a"};
	   for(int i=0;i<a.length;i++){
		   for(int j=i+1;j<a.length;j++){
			  if(a[i]==a[j]){
				  System.out.println("Duplicate number  " + a[i]);
			  }
		   }
	   }
	   
	   Set<String> store = new HashSet<String>();
	   for(String ss: a){
		   if(store.add(ss)==false){
			   System.out.println("Duplicate " + ss);
		   }
	   }
  }

   public static void doBobbleSort(){
	   int[] n={32,2,24,53,67,3,42};
	   int temp=0;
	   for(int i=0;i<n.length;i++){
		   for(int j=i+1;j<n.length;j++){
			   if(n[i]>n[j]){
				   temp=n[i];
				   n[i]=n[j];
				   n[j]=temp;
			   }
		   }System.out.print(n[i]+", ");
	   }
   }

}
