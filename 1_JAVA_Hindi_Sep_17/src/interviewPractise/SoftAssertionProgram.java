package interviewPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionProgram {
    @Test
	public void mainTest() {
		WebDriver dr=new FirefoxDriver();
		dr.get("http://executeautomation.com/demosite/index.html");
		System.out.println(dr.getTitle());
        String actual_t=dr.getTitle();
        String Expect="ABC";
        //Assert.fail("Not match");
        SoftAssert soft =new SoftAssert();
        //Assert.assertEquals(Expect, actual_t);
        soft.assertEquals(actual_t, Expect);
        System.out.println("Done............................");
        List<WebElement> link=dr.findElements(By.tagName("a"));
        System.out.println(link.size());
        for(int i=0;i<link.size();i++){
        	System.out.println(link.get(i).getText());
        }
        
        dr.quit();
        soft.assertAll();
	}
}
