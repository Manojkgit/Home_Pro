package April_Package;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class OpenBrowser {
    public static WebDriver dr;
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chrome//chromedriver.exe");
		//ChromeOptions op = new ChromeOptions();
		//op.addArguments("--disable-extension");
		
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
		dr  = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://care.d2h.com/cms/default.aspx");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[contains(text()='Login')]")).click();
		String Actual = dr.findElement(By.id("rfvUserName")).getText();
		String ExText = "Enter Username";
		Assert.assertEquals(Actual, ExText);
		System.out.println("Both matched.... Now Enter userName");
		
		Thread.sleep(3000);
		dr.quit();
	}
}


