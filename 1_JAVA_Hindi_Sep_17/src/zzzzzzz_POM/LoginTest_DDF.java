package zzzzzzz_POM;

import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginTest_DDF extends Base_POM{
	LoginPage login;
	String TC="LoginTest";
	public static final Logger log=Logger.getLogger(LoginTest_DDF.class.getName());
	@Test(dataProvider="getData")
	public void LoginTestfaceBook(Hashtable<String,String> tb){
		test=ext.startTest("Login Test");
		if(tb.get("Runmode").equals("N")){
			throw new SkipException("Because -- Runmode N");
		}
		openBro(pro.getProperty("Browser"));
		log.info("Browser Opened");
		test.log(LogStatus.INFO,"Open Browser");
		navigate(pro.getProperty("appurl"));
		login=new LoginPage(dr, test);
		login.doLogin(tb.get("userName"), tb.get("Password"));
		Screen();
		log.info("Screen shot Done Test Page");
	}
	@DataProvider
	public Object[][] getData(){
		return ExcelUtilData_DDF.getDataFromExcel(xls, TC);
	}
	
	@AfterTest
	public void tearDown(){
		ext.endTest(test);
		ext.flush();
		dr.quit();
	}

}
