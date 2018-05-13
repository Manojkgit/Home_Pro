package aaaa_Program_Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class XpathClass {
    public WebDriver dr;
	@Test
	public void loginAmazon(){
		dr =new FirefoxDriver();
		dr.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&prevRID=FPMYZ5V2K703PE576DDA&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        System.out.println(dr.getTitle());
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait(2);
        /*
        String level =dr.findElement(By.xpath("//div[@class='a-box-inner']/h1")).getText();
	    System.out.println(level);*/
	    System.out.println("I got level");
	  
	    dr.findElement(By.xpath("//*[starts-with(@id,'ap_customer_name')]")).sendKeys("manoj");
	   
	    //dr.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	    
	    wait(1);
	
	    ////*[starts-with(@id,'ap_pa')]/following::input[1]
	    
	    System.out.println(dr.findElement(By.xpath("//*[starts-with(@id,'ap_pa')]")).getAttribute("placeholder"));
	    
	    dr.findElement(By.xpath("//*[starts-with(@id,'ap_pa')]//following::input[1]")).click();
	    
	    
	    /* WebElement codeBox = dr.findElement(By.xpath("//div[@class='a-popover-inner a-lgtbox-vertical-scroll']"));
	     //*[starts-with(@id,'ap_pass')]//following::input[1]
	    
	    List<WebElement> linkCountryCode = codeBox.findElements(By.tagName("a"));
	    System.out.println(linkCountryCode.size());
	    String area="Algeria +213";
	    for(int i=0;i<linkCountryCode.size();i++){
	    	System.out.println(linkCountryCode.get(i).getText().trim());
	    	if(linkCountryCode.get(i).getText().trim().equalsIgnoreCase(area)){
	    		linkCountryCode.get(i).click();
	    	    break;
	    	}
	    	
	    }
*/       
	    System.out.println("Done..... **********************************");
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
