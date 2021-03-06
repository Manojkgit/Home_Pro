package naveenProgram;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkFacebook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//ChromeDriver.exe");
        WebDriver dr = new ChromeDriver();
        
		dr.get("https://www.facebook.com/");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.findElement(By.name("email")).sendKeys("manojk2829@gmail.com");
        dr.findElement(By.name("pass")).sendKeys("maurya@282920");
        dr.findElement(By.name("pass")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> link=dr.findElements(By.tagName("a"));
        link.addAll(dr.findElements(By.tagName("img")));
        System.out.println("Tatal Link ---- >   "+ link.size());
        
        List<WebElement> active=new ArrayList<WebElement>();
        
        for(int i=0;i<link.size();i++){
           if(link.get(i).getAttribute("href") !=null && (!link.get(i).getAttribute("href").contains("javascript"))){
        	   active.add(link.get(i));
           }
        }
        System.out.println("Total active link....... " + active.size());
        
        for(int j=0;j<active.size();j++){
        	HttpURLConnection con=(HttpURLConnection) new URL(active.get(j).getAttribute("href")).openConnection();
        	con.connect();
        	String Response = con.getResponseMessage();
        	con.disconnect();
        	System.out.println(active.get(j).getAttribute("href")+" ------ > "+ Response);
        }
        
        
        
        
        
        
        
        
	}

}
