package Base_prectice16Apr17;

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
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ZZ_Base {
    public WebDriver dr;
    public Properties pro;
    public ExtentReports ext = ExtentManager.getInstance();
    public ExtentTest  test;
    public void initialization(){
         pro = new Properties();
         try{
        	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//config//config.properties");
             pro.load(fis); 
         }catch(Exception ex){
        	 System.out.println(ex.getMessage());
        	 ex.printStackTrace();
         }
         System.out.println(pro.getProperty("AppURL"));
         System.out.println(pro.getProperty("Bro_EXE"));
   }
    
    public void openBro(String BroName){
    	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chrome//chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", pro.getProperty("Bro_EXE"));	
    	if(BroName.equalsIgnoreCase("chrome")){
    		dr = new ChromeDriver();
    	}else if(BroName.equalsIgnoreCase("firefox")){
    		dr = new FirefoxDriver();
    	}
    	dr.manage().window().maximize();
    	dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }
    public void navigate(String URL){
    	dr.navigate().to(pro.getProperty(URL));
    }
    public void typeUserID(String locaterKey, String data){
    	getElement(locaterKey).sendKeys(data);
    }
    public void typePassword(String locaterKey, String data){
    	getElement(locaterKey).sendKeys(data);
    }
    public void ClickLogin(String locaterKey){
    	getElement(locaterKey).click();
    }
    
    public boolean isElementPresent(String locaterKey){
    	List<WebElement> listElement = null;
    	if(locaterKey.endsWith("_id"))
    		listElement = dr.findElements(By.id(pro.getProperty(locaterKey)));
    	else if(locaterKey.endsWith("_name"))
    		listElement = dr.findElements(By.name(pro.getProperty(locaterKey)));
    	else if(locaterKey.endsWith("_xpath"))
    		listElement = dr.findElements(By.xpath(pro.getProperty(locaterKey)));
    	else {
    		reportfail("locater not found " + locaterKey);
    		Assert.fail("Locater not found");
    	}
    	if(listElement.size()==0){
    		return false;
    	}else
    	return true;
    }
    
    public boolean reportfail(String report){
    	return false;
    }
    public WebElement getElement(String locater){
    	WebElement e = null;
    	if(locater.endsWith("_id")) 
    		e = dr.findElement(By.id(pro.getProperty(locater)));
    	else if(locater.endsWith("_name")) 
    		e = dr.findElement(By.name(pro.getProperty(locater)));
    	else if(locater.endsWith("_xpath")) 
    		e = dr.findElement(By.xpath(pro.getProperty(locater)));
    	return e;
    	}
    /************* Reporting Screen Shot ***********************/
    public void ScreenShot_Capture(){
    	Date d = new Date();
    	String ScreenFileName = d.toString().replace(" ", "_").replace(":", " ");
    	File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
    	try{
    		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//report//"+ScreenFileName));
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
         test.log(LogStatus.INFO, "Add screenShot -- > ", test.addScreenCapture(System.getProperty("user.dir")+"//report//"+ScreenFileName));    	
    }
}
