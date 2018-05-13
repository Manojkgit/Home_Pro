package aaaa_Program_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterTest {
	public WebDriver dr;
	@Test(dataProvider="getData")
	public void doLogin(String u,String p){
		if(p.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
			dr=new ChromeDriver();
		}
		else{
			dr=new FirefoxDriver();
		}
		System.out.println(u+ " ---- " + p);
	}
	
	@AfterMethod
	public void closeBrowser(){
		if(dr!=null){
			try{
				Thread.sleep(4000);
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}finally{
				dr.quit();
			}
		}
	}

	
	@DataProvider(parallel=true)
	public Object[][] getData(){
		Object[][] da=new Object[2][2];
		da[0][0] = "u1";
		da[0][1] = "chrome";
		
		da[1][0] = "u2";
		da[1][1] = "p2";
		
		 return da;
	}
}
