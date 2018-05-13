package CallingPackage;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseClass;
import Base.DataUtil_Sender;
import Base.Xls_Reader;

public class CallSimple extends BaseClass {
	String testcase = "TestC";
    @Test(dataProvider="getData")
    public void loginByExcel(Hashtable<String,String> data) throws Exception{
    	test = ext.startTest("login by Excel");
    	test.log(LogStatus.INFO, "User initialized Now");
   
    	test.log(LogStatus.PASS, "Open Brower");
    	openBrow("chrome");
    	navigate("NewAppURL");
    	typeUserID("userName_name", data.get("col1"));
    	typePass("Password_name", data.get("col2"));
    	clickBTN("Login_xpath");
    	test.log(LogStatus.INFO, "Take Screen Shot");
    	Thread.sleep(3000);
    	screenShot();
    	Thread.sleep(2000);
    	dr.quit();
    }
    @AfterMethod
    public void tearDown(){
    	ext.endTest(test);
    	ext.flush();
    }
    @DataProvider
    public Object[][] getData(){
    initialization();
    xls = new Xls_Reader(pro.getProperty("ExcelData_path"));
    return DataUtil_Sender.getTestData(xls, testcase);
    		
    }
  }
