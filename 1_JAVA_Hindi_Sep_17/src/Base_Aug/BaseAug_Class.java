package Base_Aug;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Util_File.ExtentManage;

public class BaseAug_Class {
	public Properties pro;
	public WebDriver dr;
    public ExtentReports ext = ExtentManoj.manojReport();
    public ExtentTest test;
	public void in(){
		String propertiesFilePath = System.getProperty("user.dir")+"//src//Util_File//OR.properties";
		pro = new Properties();
		try{
			FileInputStream fis = new FileInputStream(propertiesFilePath);
			pro.load(fis);
		}catch(Exception e){System.out.println(e.getMessage());}
		System.out.println(pro.getProperty("Appurl"));
		System.out.println(pro.getProperty("ExcelPath"));
	}
	
	public void open(String b){
		if(b.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", pro.getProperty("Browser_exe"));
			dr = new ChromeDriver();
		}else{dr = new FirefoxDriver();}
		test.log(LogStatus.INFO,  "Browser open sucessfully...." + b);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, b + " ---- "+ "Browser Window maximized...");
	}
    
	public void navigate(String url){
		dr.get(pro.getProperty(url));
		test.log(LogStatus.INFO, "Browser expect the URL --- " + pro.getProperty(url));
	}
	
	public void input(String loc,String data){
		getElement(loc).sendKeys(data);
	}
	
	public void click(String loc){
		getElement(loc).click();
	}
   
	public WebElement getElement(String loc){
		WebElement w = null;
	  try{
		 if(loc.endsWith("_id")){
			w = dr.findElement(By.id(pro.getProperty(loc)));	
		}else if(loc.endsWith("_name")){
			w = dr.findElement(By.name(pro.getProperty(loc)));	
		}else if(loc.endsWith("_xpath")){
			w = dr.findElement(By.xpath(pro.getProperty(loc)));	
		}else {
			System.out.println("Locater not found in given WebElement -- > " + loc);
			reportFail("Locator not found...");
		}
	   }catch(Exception e){
			e.printStackTrace();
			reportFail("Locator not found...");
		}
	  return w;
	}
	
	public boolean reportFail(String msg){
		ScreenShot();
        test.log(LogStatus.FAIL, "Report the Fail -- > " + msg);
		return false;
	}
	
	public boolean isElementPresent(String locator){
		List<WebElement> listElement = null;
		try{
		 if(locator.endsWith("_id")){
			listElement = dr.findElements(By.id(pro.getProperty(locator)));
		}else if(locator.endsWith("_name")){
			listElement = dr.findElements(By.name(pro.getProperty(locator)));
		}else if(locator.endsWith("_xpath")){
			listElement = dr.findElements(By.xpath(pro.getProperty(locator)));
		  }
		}catch(Exception exe){
			exe.getMessage();
		}if(listElement.size()==0){
			return false;
		}return true;
	}
	
	public void ScreenShot(){
	     Date d = new Date();
	     String FileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
	     File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	     try{
	    	 FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+FileName));
	     }catch(Exception ex){
	    	 System.out.println(ex.getMessage());
	     }
	     test.log(LogStatus.INFO, "Take Screen shot-- > " + test.addScreenCapture(System.getProperty("user.dir")+FileName));
	}
}
