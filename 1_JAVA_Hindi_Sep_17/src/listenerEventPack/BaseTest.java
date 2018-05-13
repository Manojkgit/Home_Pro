package listenerEventPack;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
     public WebDriver dr;
     public static final Logger lo=Logger.getLogger(BaseTest.class);
     public BaseTest(){
    	 String logFilePath = System.getProperty("user.dir")+"//src//log4j_File_Package//log4.properties";
    	 PropertyConfigurator.configure(logFilePath);
    	 lo.info("Start to Logging Execution test by Logger Class");
     }
     
     public void openBro(String b){
     	if(b.equals("chrome")){
     		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
     		dr=new ChromeDriver();
     	}else{
     		dr=new FirefoxDriver();
     	}
     	lo.info("Open the browser --- > " + b);
     	dr.manage().window().maximize();
     	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	lo.info("Maximize the window size...");
     }
     
     public void wait(int s){
     	try{
     		Thread.sleep(s*1000);
     	}catch(Exception e){System.out.println(e.getMessage());
     	}
     	lo.info("Wait for locater --- > " + s  + " second.");
     }
     
     public void navigate(String url){
    	 dr.navigate().to(url);
    	 lo.info("Enter the URL in Browser --- > " + url);
     }
     
    public void inputType(String locter,String data){
    	getElement(locter).sendKeys(data);
    	lo.info("Enter the text in Text box --- > " + locter);
    }
    
    public void inputType_Click(String locter){
    	getElement(locter).sendKeys(Keys.ENTER);
    	lo.info("Enter the text in Text box --- > " + locter);
    }
     
     public WebElement getElement(String loc){
    	 WebElement w=null;
    	 if(loc.endsWith("_id")){
    		 w=dr.findElement(By.id(loc));
    	 }else if(loc.endsWith("_name")){
    		 w=dr.findElement(By.name(loc));
    	 }else if(loc.endsWith("_xpath")){
    		 w=dr.findElement(By.xpath(loc));
    	 }
    	 return w;
     }
}
