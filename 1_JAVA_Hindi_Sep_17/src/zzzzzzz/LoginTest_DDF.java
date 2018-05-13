package zzzzzzz;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginTest_DDF extends Base_DDF{
	String TC="LoginTest";
	@Test(dataProvider="getData")
	public void LoginTestfaceBook(Hashtable<String,String> tb){
		test=ext.startTest("Login Test");
		if(tb.get("Runmode").equals("N")){
			throw new SkipException("Because -- Runmode N");
		}
		openBro(pro.getProperty("Browser"));
		test.log(LogStatus.INFO,"Open Browser");
		navigate(pro.getProperty("appurl"));
		inputT("LoginID_id", tb.get("userName"));
		inputT("Pass_id", pro.getProperty("Password"));
		inputType_Click("Pass_id");
		Screen();
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
