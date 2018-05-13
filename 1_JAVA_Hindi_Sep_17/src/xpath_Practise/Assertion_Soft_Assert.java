package xpath_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Soft_Assert {
	
	@Test
	public void doLogin(){
		SoftAssert soft = new SoftAssert();
		
		String Actual_ID_login="manoj";
		String Expected_ID_login="manoj1";
		System.out.println("A");
		soft.assertEquals(Actual_ID_login, Expected_ID_login);
		//Assert.assertEquals(Actual_ID_login, Expected_ID_login);
	    soft.assertEquals(3>1, 3<12);
	    System.out.println("Not Pass");
		System.out.println("B");
		Assert.assertFalse(false);
        System.out.println("Assert fail Directaly....");
		
		WebDriver dr=new FirefoxDriver();
		dr.get("http://executeautomation.com/demosite/index.html");
		System.out.println(dr.getTitle());
		soft.assertAll();
	}

}
