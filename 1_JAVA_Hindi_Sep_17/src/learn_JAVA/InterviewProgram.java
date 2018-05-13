package learn_JAVA;

public class InterviewProgram {

	public static void main(String[] args){
		int n=8,k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%==  ");
       for(int a=6;a>=1;a--){
    	   for(int b=1;b<=a;b++){
    		   System.out.print("* ");
        	}System.out.println();
        	}
       for(int i=2;i<=6;i++){
    	   for(int j=1;j<=i;j++){
    		   System.out.print("* ");
    	   }System.out.println();
       }
        }
		
		
		
		
		/*	int n=6,k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}*/
		
		
		
	/*	int n=371,sum=0,r,temp;
		temp=n;
		while(n>0){
			r=n%10;
			sum= sum+(r*r*r);
			n=n/10;			
		}if(temp==sum){
		System.out.println("Number is Armistrome");}
		else{
			System.out.println("Number is Not Armistrome");
		}*/
		
		/*int c=0,a,temp,n=371;
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}if(temp==c){
			System.out.println("Number is Armistrome");
		}else{
			System.out.println("Not Armistrome...");
		}
		
		
		
		
		
		
		
		
		/*int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=10;i++){
			n3=n1+n2;
			System.out.print(" " +n3);
		    n1=n2;
		    n2=n3;
		}
		
*/		
		
		
		
		
		
		/*//Palindrome number
		int n=1221,r,temp,sum=0;
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}if(temp==sum){
			System.out.println(sum + " Number is palindrome");
		}else{
			System.out.println("Number is not Palindrome.");
		}
	*/	
		
		
        //Print prime number
		/*int n=32;boolean isP=true;
		for(int i=2;i<n/2;i++){
				if(n%i==0){
					isP=false;
					break;
				}
		}if(isP){
				System.out.print("Prime ");
			}else{
				System.out.println("Not");
		}
*/		
		
		
		
		
		/*int c=0,a,temp,n=371;
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}if(temp==c){
			System.out.println("Number is Armistrome");
		}else{
			System.out.println("Not Armistrome...");
		}
	
	int sum=0,nn=1221,r,te;
	te=nn;
	while(nn>0){
		r=nn%10;
		sum=(sum*10)+r;
		nn=nn/10;
	}if(te==sum){
		System.out.println(sum + " Number is Palindrome..");
	}else{
		System.out.println("Number is Not palindrome....");
	}
*/	
	}
