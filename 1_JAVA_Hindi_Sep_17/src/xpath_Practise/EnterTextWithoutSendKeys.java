package xpath_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterTextWithoutSendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("http://executeautomation.com/demosite/index.html?UserName=d&Password=d&Login=Login");
		System.out.println(dr.getTitle());
		JavascriptExecutor executor = (JavascriptExecutor)dr;
		executor.executeScript("document.getElementByXpath(//input[@id='FirstName']).value='Kushwaha'");
		/*		dr.findElement(By.id("FirstName")).sendKeys("manoj");
		dr.findElement(By.id("FirstName")).sendKeys("Kushwaha");
		Thread.sleep(4000);
		dr.findElement(By.id("FirstName")).clear();
		dr.findElement(By.id("FirstName")).sendKeys("Kushwaha");*/
		
		
		
		
	}

}
