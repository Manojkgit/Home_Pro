package mukesh_Otwani;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_In_WebDriver {
  public static Actions act;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-extensions");
	    WebDriver dr=new FirefoxDriver();
		dr.get("http://executeautomation.com/demosite/index.html");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.findElement(By.id("FirstName")).sendKeys("Manoj");
		
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		dr.manage().window().maximize();
		
		WebElement mainWin=dr.findElement(By.xpath("html/body/div[1]/ul/li[2]/a"));
		System.out.println(mainWin.getText());
		
		WebElement box=dr.findElement(By.xpath("html/body/div[1]/ul/li[2]/ul"));
		WebElement box_another=dr.findElement(By.xpath("html/body/div[1]/ul/li[2]/ul/li[1]/ul/li[2]/a"));
		//Thread.sleep(2000);
		act=new Actions(dr);
		act.moveToElement(mainWin).perform();
		Thread.sleep(1000);
		act.moveToElement(box).perform();
		List<WebElement> boxText = box_another.findElements(By.tagName("a"));
		for(int i=0;i<boxText.size();i++){
			System.out.println(boxText.get(i).getText());
		}
		System.out.println(box.getText());
		Thread.sleep(1000);
		
		act.moveToElement(box_another).click().build().perform();
		Thread.sleep(1000);
		System.out.println(dr.getTitle());
		Thread.sleep(2000);
		
		System.out.println("Done");
		dr.quit();
	}

}
