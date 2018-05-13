package interviewPractise;

public class ReverseNumberAndString {

	public static void main(String[] args) {
		String s="manoj kushwaha";
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println("__________________");
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	
	   int n=1234;
	   String num=String.valueOf(n);
	   StringBuffer sbb=new StringBuffer(num);
	   System.out.println(sbb.reverse());
	   int rev=0;
	   while(n!=0){
		   rev=rev*10+n%10;
		   n=n/10;
	   }
	   System.out.println(rev);
	
	   String r="";
	   
	}

}
