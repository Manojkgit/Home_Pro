package eventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Listener_Demo_Application extends BaseTest{
    public EventFiringWebDriver driver;
    @Test
    public void loginTesting(){
    	MyListener mylistener = new MyListener();
    	openBro("chrome");
    	driver = new EventFiringWebDriver(dr);
    	driver.register(mylistener);
    	driver.navigate().to("http://executeautomation.com/demosite/Login.html");
        logger.info("My Listener lass Registered and Test Execution start." );
        driver.findElement(By.name("UserName")).sendKeys("manoj");
        driver.findElement(By.name("Password")).sendKeys("Kushwaha");
        driver.findElement(By.name("Login")).click();
        System.out.println("Enter User name and Password --- > Click on Login button");
        wait(5);
        driver.navigate().back();
    }

 @AfterTest
 public void tearDown(){
        wait(10);
        dr.quit();
 }
}
