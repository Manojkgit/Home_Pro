package xpath_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpathClass {
    public WebDriver dr;
    @Test
	public void mainTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
        dr=new ChromeDriver();
        dr.get("https://www.freecrm.com/index.html");
        String url = dr.getCurrentUrl();
        System.out.println(url);
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        dr.findElement(By.name("username")).sendKeys("naveenk");
        dr.findElement(By.name("password")).sendKeys("test@123");
        dr.findElement(By.name("password")).sendKeys(Keys.ENTER);
        Thread.sleep(2);
        dr.switchTo().frame("mainpanel");
        Thread.sleep(2);
        dr.findElement(By.xpath("//a[text()='Contacts']")).click();
        dr.findElement(By.xpath("//a[text()='dg dgdgdgdg']//parent::td[@class='datalistrow']//preceding-sibling::td")).click();
        
    }

}
