package xpath_Practise;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import interviewPractise.ExtentReportTest;

public class GenerateExtentReport {
	public WebDriver dr;
	public ExtentReports ext=ExtentReportTest.getReport();
	public ExtentTest test;
	
	@Test
	public void extentTestReporting(){
		test=ext.startTest("Generate Report ");
	    System.setProperty("webdriver.chrome.driver", "D://Browser_exe/chromedriver.exe");
		dr=new ChromeDriver();	
		test.log(LogStatus.PASS,"Browser Open successfully....");
		dr.get("http://google.com/");
		Date d=new Date();
		String FN=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//report//"+FN));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		test.log(LogStatus.PASS, "Take Screen -- > " + test.addScreenCapture(System.getProperty("user.dir")+"//report//"+FN));
	}
	
	@AfterTest
	public void tearDown(){
		ext.endTest(test);
		ext.flush();
		dr.quit();
	}

}
