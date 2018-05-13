package a_1_Program;

import java.util.Arrays;

public class All_Java_Interview_Class{

	public static void main(String[] args) {
		String s="manoj Kushwaha Sarita Kushwaha";
		int count=0;
		for(int i=0;i<s.length();i++){//i+=2
			if(s.charAt(i)=='a'){
				count++;
			}
		}if(count>0){
			System.out.println(count +"    "+ 'a');
		}
		sortingBobble();
		System.out.println();
		AnagramNumber("maoj","ma oJ");
        anagram_Test("manavi", "vimaan");
		number_Of_A_In_String("manoj kushwaha test a application by a count");
		System.out.println();
		reverse_Number(123);
	}
	
	public static void reverse_Number(int n){
		String num=Integer.toString(n);
		StringBuffer sb=new StringBuffer(num);
		System.out.println(sb.reverse());
		System.out.println();
		
		
		int rev=0;
		while(n>0){
			
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	public static void anagram_Test(String s1,String s2){
		boolean status=true;
		String s11=s1.replaceAll("\\s", "");
		String s22=s2.replaceAll("\\s", "");
		if(s11.length()!=s22.length()){
			System.out.println("Not Anagram");
			status=false;
		}else{
			char[] c1=s11.toLowerCase().toCharArray();
			char[] c2=s22.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			status=Arrays.equals(c1, c2);
		}
		if(status){
			System.out.println("True");
		}else{
			System.out.println("Falses");
		}
	}
	
	public static void AnagramNumber(String s1,String s2){
		boolean status=true;
		String s11=s1.replaceAll("\\s", "");
		String s22=s2.replaceAll("\\s","");
		if(s11.length()!=s22.length()){
			System.out.println("Not Anagram");
		    status=false;
		}
		else{
		char[] ch1=s11.toLowerCase().toCharArray();
		char[] ch2=s22.toLowerCase().toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
		  status=Arrays.equals(ch1, ch2);
    	}
		if(status){
			System.out.println("Anagram");
		}else{
			System.out.println("not");
		}
		
		
	}

	public static void number_Of_A_In_String(String aa){
		int count=0;
		for(int i=0;i<aa.length();i++){
			if(aa.charAt(i)=='a'){
				count++;
			}
		}if(count>0){
			System.out.println("Number of A --- >  " + count);
		}
		for(int i=0;i<aa.length();i+=2){
			System.out.print(aa.charAt(i)+",");
		}
		System.out.println();
		for(int i=aa.length()-1;i>=0;i--){
			System.out.print(aa.charAt(i));
		}
	}
	
	public static void sortingBobble(){
		int[] n={12,43,67,23,65,87,10,2,344};
		int temp=0;
		int s=n[0];
		int l=n[0];
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

		for(int i=0;i<n.length;i++){
		if(n[i]>l){
			l=n[i];
		}if(n[i]<s){
			s=n[i];
		   }
		}
		System.out.println();
		for(int i=n.length-1;i>=0;i--){
			System.out.print(n[i]+",");
		}
		System.out.println();
		System.out.println(s+"  "+l);
		System.out.println();
		System.out.println("Arrays --- > " + Arrays.toString(n));
		int max1=0;
		int max2=0;
		for(int num:n){
			if(max1<num){
				max2=max1;
				max1=num;
			}else if(max2<num){
				max2=num;
			}
		}
		 System.out.println(max1+"   "+max2);
         
	}
}
