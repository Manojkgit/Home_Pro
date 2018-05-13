package learn_JAVA;

public class Recursive {

	public static void main(String[] args) {
		rec(1);
		System.out.println();
		int fact = 1;
		for(int i=1;i<=5;i++){
			fact = fact*i;
		}
		System.out.println(fact);
		System.out.println();
		int table,num=2;
		for(int t=1;t<=10;t++){
			table = num*t; 
		System.out.print(table+ " ");
		}
	}
	
	public static void rec(int i){
		if(i<=10){
			System.out.println(i);
			rec(i+1);
		}
	}

}
