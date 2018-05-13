package aaaa_Program_Package;

public class OutPut_1 {
	public static void main(String[] args) {
		int x=0;
		while(true){
		x = increment(x);
		System.out.println("Value of x is --"+x);
		
		if(x>10)
		break;

		}
		}

		public static int increment(int i){
		return i+1;
		}

}
