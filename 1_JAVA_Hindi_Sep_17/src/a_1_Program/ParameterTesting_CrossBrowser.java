package a_1_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting_CrossBrowser {
	WebDriver dr;
	@Test(dataProvider="getTest")
	//@Parameters("Browser")
	public void testbrowser(String user,String pass){
		/*if(b.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
			dr=new ChromeDriver();
		}else{
			System.out.println("Browser is not chrome");
			dr=new FirefoxDriver();
		}*/
		
		System.out.println(user+"   "+pass);
	}
	
	
	
	
	@DataProvider
	public Object[][] getTest(){
		Object[][] d=new Object[3][2];
		d[0][0] = "d00";
		d[0][1] = "d00";
		
		d[1][0] = "d00";
		d[1][1] = "d00";
		
		d[2][0] = "d00";
		d[2][1] = "d00";
		return d;
	}
	

}
