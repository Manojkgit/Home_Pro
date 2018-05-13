package a_1_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://facebook.com");
        dr.manage().deleteAllCookies();
        dr.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
        dr.manage().window().maximize();
        System.out.println(dr.getCurrentUrl());
        System.out.println(dr.getTitle());
        
        List<WebElement> link=dr.findElements(By.tagName("a"));
        System.out.println(link.size());
        for(int i=0;i<link.size();i++){
        	System.out.println(link.get(i).getText());
        }
        
        try{
        	Thread.sleep(5000);
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
        dr.quit();
	}
	

}
