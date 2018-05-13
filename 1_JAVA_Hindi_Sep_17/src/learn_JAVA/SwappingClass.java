package learn_JAVA;

public class SwappingClass {

	public static void main(String[] args) {
        int i=10;
        int j=20;
        int swap = j+i;
        j=swap-j;
        i=swap-i;
        
	        /*i=i+j;
	        j=i-j;
	        i=i-j;*/
        System.out.println("I --> " + i + "  " + "J --> " +j);
	}

}
