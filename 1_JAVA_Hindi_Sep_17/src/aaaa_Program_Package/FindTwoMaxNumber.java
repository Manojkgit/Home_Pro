package aaaa_Program_Package;

public class FindTwoMaxNumber {

	public static void main(String[] args) {
		maxNumber_1_2();
	}

	public static void maxNumber_1_2(){
		int[] n={23,3,6,4,546,2,36,1,-232,-578,234};
		int max1=0;
		int max2=0;
		for(int num:n){
			if(max1<num){
				max2=max1;
				max1=num;
			}
			else if(max2<num){
				max2=num;
			}
		}
		System.out.println("max1 = " + max1);
		System.out.println("max2 = " + max2);
		
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
	    System.out.println();
	    System.out.println("------------------------");
	    int s=n[0];
	    int l=n[0];
	    for(int i=0;i<n.length;i++){
	    if(n[i]<s){
	       s=n[i]; 	
	    }else if(n[i]>l){
	    	l=n[i];
	    }
	   }
	    System.out.println("Small -- "+s);
	    System.out.println("Large -- "+l);
	}
}
