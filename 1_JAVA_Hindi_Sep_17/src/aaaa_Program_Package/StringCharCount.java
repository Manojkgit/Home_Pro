package aaaa_Program_Package;

public class StringCharCount {

	public static void main(String[] args) {
		String s="manoj manoj sarita sarita";
		char[] c= s.toCharArray();
		for(int i=0;i<c.length;i++){
			int co=0;
			for(int j=0;j<c.length;j++){
				if(c[i]==c[j])
					if(i==s.indexOf(c[i])){
						co++;
					}
			}if(co>0){
				System.out.println(c[i]+ "  "+ co);
			}
		}

	}

}
