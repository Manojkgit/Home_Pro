package interviewPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
        public WebDriver dr;
		@Test
		@Parameters("Browser")
		public void testBrowser(String b){
			System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
			if(b.equalsIgnoreCase("chrome")){
				dr=new ChromeDriver();
			}else{
				dr=new FirefoxDriver();
			}
		}
    @AfterTest
    public void tear(){
    	dr.quit();
    }
}

