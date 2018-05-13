package interviewPractise;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
    public WebDriver dr;
    @Test	
    @Parameters("BrowserTest")
    public void testBrowser(String b){
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
		if(b.equalsIgnoreCase("chrome")){
			dr=new ChromeDriver();
		}else{
			dr=new FirefoxDriver();
		}
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http://google.com");
		System.out.println(dr.getTitle());
		
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//report//A1.jpg"));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
    
    @AfterTest
    public void testDown(){
        try{
        	Thread.sleep(4000);
        }catch(Exception es){
        	System.out.println(es.getMessage());
        }
    	dr.quit();
    }
}
