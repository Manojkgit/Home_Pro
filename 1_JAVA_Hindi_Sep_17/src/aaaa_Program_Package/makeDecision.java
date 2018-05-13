package aaaa_Program_Package;

public class makeDecision {

	public static void main(String[] args) {
		int i=2;
		while(m(i)){
			i=i*i;
			System.out.println(i);			
		}

	}
	

public static boolean m(int i)
{
if(i%3 != 0){
return true;
}else{
return false;
}
}

}
