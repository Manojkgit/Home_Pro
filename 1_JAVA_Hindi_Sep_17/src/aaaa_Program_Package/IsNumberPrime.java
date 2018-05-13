package aaaa_Program_Package;

public class IsNumberPrime {

	public static void main(String[] args) {
		int n=17;boolean isP=true;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				isP=false;
			}
		}if(isP){
			System.out.println("Number is Prime");
		}else{
			System.out.println("NOT");
		}
	}

}
