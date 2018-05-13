package interviewPractise;

import java.util.Scanner;

public class SwappingPro {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number -- > ");
		String a=s.nextLine();
		String b=s.nextLine();
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+"   "+ b);
		
		/*String aa="manoj";
		String bb="manavi";
		aa=aa+bb;
		aa=aa.substring(0,aa.length()-bb.length());
		bb=aa.substring(bb.length());
		System.out.println(aa+"  "+bb);*/
	}

}
