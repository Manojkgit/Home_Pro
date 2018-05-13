package a_1_Program;

public class Alternet_char_String {

	public static void main(String[] args) {
		String s="manoj Kushwaha Sarita Kushwaha";
		char[] cc=s.toCharArray();
        for(int i=0;i<cc.length;i+=2){
        	System.out.println(cc[i]);
        }
	}

}
