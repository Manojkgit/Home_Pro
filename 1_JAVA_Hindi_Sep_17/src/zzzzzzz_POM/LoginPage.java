package zzzzzzz_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends Base_POM {
	
	@FindBy(id="email")
	WebElement userId;

	@FindBy(id="pass")
	WebElement Password;
	
	public LoginPage(WebDriver dr,ExtentTest test){
	   	super(dr,test);
	   	PageFactory.initElements(dr, this);
	}
	
	
	public void doLogin(String u,String p){
		userId.sendKeys(u);
		test.log(LogStatus.INFO, "Enter user name");
		Password.sendKeys(p);
		Screen();
		Password.sendKeys(Keys.ENTER);
	}

}
