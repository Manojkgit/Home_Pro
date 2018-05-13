package xpath_Practise;

import java.util.concurrent.TimeUnit;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Link_Class {
		public WebDriver dr;
	    @Test
		public void xpathTest() {
			dr=new FirefoxDriver();
			dr.navigate().to("http://shopping.rediff.com/");
			System.out.println(dr.getTitle());
			dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait(1);
	    	String part1 = "html/body/div[7]/div[1]/div[3]/div[1]/div/h3[";
			String part2 = "]/a";
			for(int i=1;i<=14;i++){
				System.out.println(dr.findElement(By.xpath(part1+i+part2)).getText());
				String url = dr.findElement(By.xpath(part1+i+part2)).getAttribute("href");
				get_Response_Code(url);
				System.out.println("-------------------------------");
				dr.findElement(By.xpath(part1+i+part2)).click();
				wait(2);

				System.out.println(dr.getTitle());
				System.out.println("-------------------------------");
				dr.navigate().back();
			}
			
			System.out.println(dr.getTitle());
		
			}
	 
	    public void get_Response_Code(String url){
	    	int res_code;
	    	try{
	    		res_code= Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
	    		System.out.println("Get Response Code --- > " + res_code);
	    	}catch(Exception e){
	    		System.out.println(e.getMessage());
	    	}
	    	
	    }
	    
		@AfterTest
		public void tearDown(){		
			if(dr!=null){
				wait(5);
				dr.quit();
			}
		}
		
		public void wait(int sec){
			try{
				Thread.sleep(sec*1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

}
