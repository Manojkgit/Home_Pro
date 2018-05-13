package a_1_Program;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link_test {
    public static WebDriver dr; 
	public static void main(String[] args) throws Exception{
		     
    		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
	    		//ChromeOptions options = new ChromeOptions();
	            //options.addArguments("headless");
	            //options.addArguments("window-size=1200x600");
	    		dr=new ChromeDriver();
	    	    dr.get("http://facebook.com/");
	    	    dr.manage().window().maximize();
	    	    dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	    System.out.println(dr.getCurrentUrl());
	    	    System.out.println(dr.getTitle());
	    	    List<WebElement> link=dr.findElements(By.tagName("a"));
	    	    System.out.println(link.size());
	    	    for(int i=0;i<link.size();i++){
	    	    	System.out.println(link.get(i).getText());
	    	    	String urllink=link.get(i).getAttribute("href");
	    	    	broken_link_Test_Method(urllink);
	    	    }
	    	    
	    	    
	    		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	    	    FileUtils.copyFile(src, new File("D://report//A.jpg"));
	    	
	    	Thread.sleep(8000);
	    	dr.quit();
	}
	
	
	public static void broken_link_Test_Method(String url){
		try{
			URL u=new URL(url);
		    HttpURLConnection con=(HttpURLConnection)u.openConnection();
		    con.setReadTimeout(2000);
		    con.connect();
		    if(con.getResponseCode()==200){
		    	System.out.println(url+" ---> "+con.getResponseMessage());
		    }else if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
		    	System.out.println(url+" --> "+con.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
		    }
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
