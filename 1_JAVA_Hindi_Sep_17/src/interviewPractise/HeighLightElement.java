package interviewPractise;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.LogStatus;

public class HeighLightElement {
	public static WebDriver dr;
	public static void main(String[] args) {
		dr=new FirefoxDriver();
		dr.get("http://facebook.com/");
		WebElement emailId = dr.findElement(By.id("email"));
		
		heighLightElement(dr,emailId);
	    getScreenShot();
		emailId.sendKeys("manojk2829@gmail.com");
	}
	
	
	public static void heighLightElement(WebDriver dr,WebElement ele){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border:3px solid red;');", ele);
	
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','background:white; border:2px solid red;');",ele);
	}
	
	public void ScreenShot(){
	     Date d = new Date();
	     String FileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
	     File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	     try{
	    	 FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+FileName));
	     }catch(Exception ex){
	    	 System.out.println(ex.getMessage());
	     }
	     //test.log(LogStatus.INFO, "Take Screen shot-- > " + test.addScreenCapture(System.getProperty("user.dir")+FileName));
	}
	
	public static void getScreenShot(){
		Date d=new Date();
		String FN=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	try{
			FileUtils.copyFile(srcFile, new File("D://report//"+FN));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
