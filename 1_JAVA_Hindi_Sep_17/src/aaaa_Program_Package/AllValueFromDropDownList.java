package aaaa_Program_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AllValueFromDropDownList {
	public WebDriver dr;
	@Test
	public void doLogin() throws InterruptedException{
		
			System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("http://executeautomation.com/demosite/index.html");
			Select dropDownValue = new Select(dr.findElement(By.xpath("//select[@id='TitleId']")));
			List<WebElement> op = dropDownValue.getOptions(); 
			System.out.println(op.size());
			for(int i=0;i<=op.size();i++){
				System.out.println(op.get(i).getText());
			}
			
			dr.findElement(By.linkText("HtmlPopup ")).click();
			for(String win: dr.getWindowHandles()){
				dr.switchTo().window(win);
			}
			Thread.sleep(2000);
			dr.findElement(By.id("FirstName")).sendKeys("Kushwhaa");
			Thread.sleep(2000);
			dr.close();
			Thread.sleep(3000);
			for(String winOld: dr.getWindowHandles()){
				dr.switchTo().window(winOld);
			}
			//dr.switchTo().defaultContent();
			dr.findElement(By.id("MiddleName")).sendKeys("Manoj");
			dr.findElement(By.name("generate")).click();
			isAlertPresent();
			System.out.println(dr.switchTo().alert().getText());
            dr.switchTo().alert().accept();		   	
			
			
	}
	
	public boolean isAlertPresent(){
		//Alert alert = 
		try{
			dr.switchTo().alert();
			
	        System.out.println("Alert present");
	        dr.switchTo().alert().accept();
	        return true;
		}catch(Throwable t){
			return false;
			
		}
	}
	
	@AfterTest
	public void closeBrowser(){
		if(dr!=null){
			try{
				Thread.sleep(4000);
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}finally{
				dr.quit();
			}
		}
	}

}
