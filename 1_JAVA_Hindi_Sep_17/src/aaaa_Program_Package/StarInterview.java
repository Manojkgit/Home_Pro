package aaaa_Program_Package;

import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StarInterview {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver","D://Browser_exe//chromedriver.exe");
		WebDriver dr =new ChromeDriver(); 
		dr.get("http://google.com/");
		Date d = new Date();
		String name= d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("D://report//"+name));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(dr.manage().window().getSize());
		dr.quit();
	}
}