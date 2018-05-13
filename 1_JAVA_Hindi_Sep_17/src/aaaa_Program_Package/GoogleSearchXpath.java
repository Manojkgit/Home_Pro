package aaaa_Program_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleSearchXpath {
	public WebDriver dr;
	public List<WebElement> link;
	@Test
	public void loginAmazon(){
		dr =new FirefoxDriver();
		dr.get("http://www.google.com");
		System.out.println(dr.getTitle());
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Sridevi a");
		link = dr.findElements(By.xpath("//ul[@class='sbsb_b' and @role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println(link.size());   
		System.out.println("Done..... ");
		for(int i=0;i<link.size();i++){
			System.out.println(link.get(i).getText());
		    if(link.get(i).getText().equalsIgnoreCase("Sridevi age")){
		        link.get(i).click();
		        break;
		    }
		}
		

	}

	@AfterTest
	public void tearDown(){
		wait(5);
		dr.quit();
	}

	public void wait(int sec){
		try{
			Thread.sleep(sec*1000);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}		
}
