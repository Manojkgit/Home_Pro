package interviewPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="getdata")
	public void testing(String u,String p){
		System.out.println(u+"   "+p);
	}

	@DataProvider
	public Object[][] getdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="U00";
		data[0][1]="P01";
		
		data[1][0]="U10";
		data[1][1]="P11";
		
		data[2][0]="U20";
		data[2][1]="P21";
		return data;
	}
}
