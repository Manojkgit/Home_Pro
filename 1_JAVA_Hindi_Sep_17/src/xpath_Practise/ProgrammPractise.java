package xpath_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProgrammPractise {
	@Test//(dataProvider="d")
	public void primeNumber(){//String u,String p
		int n[]={3,2,4,5,-3,2,6,8};
		int s=n[0];
		int l=n[0];
		for(int i=0;i<n.length;i++){
			if(n[i]>l){
				l=n[i];
			}else if(n[i]<s){
				s=n[i];
			}
			
		}System.out.println(s+" "+l);
		
		}
	
	
	@DataProvider
	public Object[][] d(){
		Object[][] data=new Object[3][2];
		data[0][0] = "u00";
		data[0][1] = "u01";
		data[1][0] = "u10";
		data[1][1] = "u11";
		data[2][0] = "u20";
		data[2][1] = "u21";
		return data;
	}
	
}		