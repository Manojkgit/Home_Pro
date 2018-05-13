package aaaa_Program_Package;

public class WithOutLoop1To10 {

	public static void main(String[] args) {
        rec(1);
	}
	
	public static void rec(int i){
		if(i<=10){
			System.out.print( i + "  " );
			rec(i+1);
		}
	}

}
