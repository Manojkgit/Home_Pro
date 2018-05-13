package CallingPackage;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.LogStatus;
import Base.BaseClass;
import Base.Xls_Reader;


public class CallFuncation extends BaseClass{
	SoftAssert softAssert = new SoftAssert();

	@Test(dataProvider="getData")
	public void Login(Hashtable<String,String> table) throws Exception{
		test = ext.startTest("Login_Called Funcation");
		test.log(LogStatus.INFO, "My test initialization ... ");
		test.log(LogStatus.INFO, table.toString());
		//initialization();
		if(table.get("Runmode").equals("N")){
			test.log(LogStatus.INFO, "Test should not be executed.");
			throw new SkipException("Test should be skipped. Runmode is N...");
		}
		openBrow("Chrome");
		test.log(LogStatus.PASS, "Open Expected Browser and Enter URL");
		navigate("AppURL");

		//Verify Text --
		/* if(!VerifyText("sign_in_Text_xpath", "SigninText"));
	        reportFAIL("Text did not match correct...");
		 */ //Email Id field not present...

		//softAssert.assertTrue(VerifyText("sign_in_Text_xpath", "SigninText"), "My first test is going to fail..");
		//softAssert.assertTrue(false, "Error 2");
		//softAssert.assertTrue(true, "Error 3");
		//softAssert.assertTrue(false, "Error 4");
		//if(!isElementPresent("User_id"))
		//reportFAIL("Locater not found Or not correct...");
		typeUserID("User_id", table.get("col1"));
		screenShot();
		clickBTN("Next_id");
		typePass("Pass_id", table.get("col2"));
		Thread.sleep(2000);

		SignIn("Sign_id");
		test.log(LogStatus.PASS, "Now start to test Screen shot...");
		screenShot();
		reportPass("My report pass.");
		dr.quit();
	}
	@AfterMethod
	public void tearDown(){
		try{
			softAssert.assertAll();
		}
		catch(Error e){
			test.log(LogStatus.FAIL, e.getMessage());
		}
		ext.endTest(test);
		ext.flush();
	}
	@DataProvider
	public Object[][] getData(){
		initialization();
		xls = new Xls_Reader(pro.getProperty("ExcelData_path"));
		String TestCaseName = "TestB";
		String SheetName = "TestData";
		int TestStartRowNO = 1;
		while(!xls.getCellData(SheetName, 0, TestStartRowNO).equals(TestCaseName)){
			TestStartRowNO++;
		}System.out.println("Test Started data number -- > " + TestStartRowNO);
		int ColStartRow = TestStartRowNO+1;
		int RowStarNo = TestStartRowNO+2;
		int row=0;
		while(!xls.getCellData(SheetName, 0, RowStarNo+row).equals("")){
			row++;
		}System.out.println("Total number of Row -- > " + row);
		int col =0;
		while(!xls.getCellData(SheetName, col, ColStartRow).equals("")){
			col++;
		}
		System.out.println("Total number of Column -- > " + col);
		Object[][] data = new Object[row][1];
		int DataRow=0;
		Hashtable<String,String> table = null;
		for(int r=RowStarNo;r<RowStarNo+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(SheetName, c, ColStartRow);
				String value = xls.getCellData(SheetName, c, r);
				table.put(key, value);
			}
			data[DataRow][0]=table;
			DataRow++;
		}
		return data;
	}
}
