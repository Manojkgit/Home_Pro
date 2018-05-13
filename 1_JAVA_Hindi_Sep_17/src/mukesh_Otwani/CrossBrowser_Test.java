package mukesh_Otwani;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test {
	public WebDriver dr;
	@Test
	@Parameters("browser")
	public void crossTest(String b){
		if(b.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
			dr=new ChromeDriver();
		}else{
			dr=new FirefoxDriver();
		}
		System.out.println("Browser --- > " + b);
	}
}
