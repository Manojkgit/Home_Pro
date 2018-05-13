package Base;

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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {
    public WebDriver dr;
    public Properties pro;
    public ExtentReports ext = ExtentManager.getInstance();
    public ExtentTest test =null;
    public Xls_Reader xls;
    public void initialization(){
    	if(pro==null){
    		pro = new Properties();
    		try{
    	   FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//conf.properties");	
    		pro.load(fis);
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    		System.out.println(pro.getProperty("AppURL"));
      }
    }
	public void openBrow(String broName){
		System.setProperty("webdriver.chrome.driver", pro.getProperty("Browser"));
		//System.getProperty("user.dir")+"//chrome//chromedriver.exe"
		if(broName.equalsIgnoreCase("chrome")){
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-extensions");
			dr = new ChromeDriver(op);
		}
		else if(broName.equalsIgnoreCase("firefox")){
			dr = new FirefoxDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	public void navigate(String URL){
		dr.get(pro.getProperty("AppURL"));
	}
	public void typeUserID(String locaterKey, String data){
		getElement(locaterKey).sendKeys(data);
		//dr.findElement(By.xpath(pro.getProperty(locaterKey)));
	}
	public void clickBTN(String locaterKey){
		getElement(locaterKey).click();
	}
		
    public void typePass(String locaterKey, String data){
    	getElement(locaterKey).sendKeys(data);
	}
    public void SignIn(String locaterKey){
    	getElement(locaterKey).click();
    }
    
    public boolean isElementPresent(String locaterKey){
    	List<WebElement>  elementList = null;
    	if(locaterKey.endsWith("_id"))
    		elementList = dr.findElements(By.id(pro.getProperty(locaterKey)));
    	else if (locaterKey.endsWith("_name"))
    		elementList = dr.findElements(By.name(pro.getProperty(locaterKey)));
    	else if(locaterKey.endsWith("_xpath")){
    		elementList = dr.findElements(By.xpath(pro.getProperty(locaterKey)));
    		}
    	else{
    		  reportFailure("Locater not correct - " + locaterKey);
    		  Assert.fail("LocaterKey Not found.");
    		}
    	if(elementList.size()==0)
    		return false;
    	else
    		return true;
    }
    
    public boolean VerifyText(String locaterKey, String ExpectedText){
    	String ActualText = getElement(locaterKey).getText().trim();
    	String expectedText = pro.getProperty(ExpectedText);
    	if(ActualText.equals(expectedText))
    	return true;
    	else
    		return false;
    }
    
    public WebElement getElement(String locater){
    	WebElement e = null;
    	try{
    	if(locater.endsWith("_id"))
    		e = dr.findElement(By.id(pro.getProperty(locater)));
    	else if (locater.endsWith("_name"))
    		e = dr.findElement(By.name(pro.getProperty(locater)));
    	else if(locater.endsWith("_xpath")){
    		e = dr.findElement(By.xpath(pro.getProperty(locater)));
    		}
    	else{
    		  reportFailure("Locater not correct - " + locater);
    		}
    	}catch(Exception ex){
    		reportFailure(ex.getMessage());
            ex.printStackTrace();
            Assert.fail("fail to find out the Test -- > " + ex.getMessage());    		
    	}
    	return e;   	
    }
    
    
    /*****************Reporting Method*********************/
    public boolean reportFailure(String report){
    	return false;
    }
    
    
    public void reportPass(String msg){
    	test.log(LogStatus.PASS, " My test report pass..");
    }
    
    public void reportFAIL(String msg){
    	test.log(LogStatus.FAIL, " My test report Fail..");
    	screenShot();
    	Assert.fail(msg);
    }
    /*****************Screen Shot Capture *********************/
    public void screenShot(){
    	Date d = new Date();
    	String SceenShotName = d.toString().replace(" ", "_").replace(":","_")+".jpg";
    	File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
    	try{
    		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//report//"+SceenShotName));
    	}
    	catch(Exception ex){
    		System.out.println(ex.getMessage());
            ex.printStackTrace();
    	}
    	test.log(LogStatus.INFO, "take Screen Shot -- > " + test.addScreenCapture(System.getProperty("user.dir")+"//report//"+SceenShotName));
    }
}
