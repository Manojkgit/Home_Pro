
package xpath_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="getData")
	public void dataProvidertesting(String user,String pass){
		System.out.println(user +"   "+pass);
	}
     
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]="a00";
		data[0][1]="a01";
		data[1][0]="a10";
		data[1][1]="a11";
		data[2][0]="a20";
		data[2][1]="a21";
		return data;
		
	}


}


