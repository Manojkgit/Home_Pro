package aaaa_Program_Package;

public class StringCount {

	public static void main(String[] args) {
		String s = "Manoj Sarita Viraj Manavi Kushwaha";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			int count=0;
			for(int j=0;j<c.length;j++){
				if(c[i]==c[j]){
					if(i==s.indexOf(c[j])){
						count++;
					}
				}
			}if(count>0){
				System.out.println(c[i]+"    --- > " + count); 
			}
		}
		System.out.println(" ----------------------- ");
		matchAndCount();
	}
	
	
	public static void matchAndCount(){
		String s1  = "Manavi Sarita Manoj Viraj";
		char[] c1 = s1.toCharArray();
		for(int i=0;i<c1.length;i++){
			int count=0;
			for(int j=0;j<c1.length;j++){
				if(c1[i]==c1[j]){
				   if(i==s1.indexOf(c1[j])){
					   count++;
				   }
				}
			}if(count>0){
				System.out.println(c1[i] + " ----- > "+count);
			}
		}
	}
}
