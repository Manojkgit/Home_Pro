package a_1_Program;

import java.io.File;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver dr;
	
	@Test    
	@Parameters("Browser")
	public void crossbrowserTesting(String b) throws Exception{
    	if(b.equalsIgnoreCase("chrome")){
    		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
    		ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("window-size=1200x600");
    		dr=new ChromeDriver(options);
    	}else{
    		dr=new FirefoxDriver();
    	}
    	File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(src, new File("D://report//A.jpg"));
    	
    	Thread.sleep(4000);
    	dr.quit();
   	
	}

}
