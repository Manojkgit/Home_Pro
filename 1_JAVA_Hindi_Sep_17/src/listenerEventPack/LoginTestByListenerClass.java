package listenerEventPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTestByListenerClass extends BaseTest{
    public EventFiringWebDriver driver;
	@Test
    public void loginTest(){
		MyListenerClass mlistener =new MyListenerClass();
		openBro("chrome");
		driver =new EventFiringWebDriver(dr);
		driver.register(mlistener);
		lo.info("Register the --- > My Listener class by driver and Refrence Object");
		
	    navigate("http://amazon.in/");
	    wait(2);
	    
	    EventFiringMouse emouse = new EventFiringMouse(driver, mlistener);
	    Locatable locable = (Locatable)driver.findElement(By.xpath("//a[@class='nav_a' and contains(text(), 'Facebook')]"));
	    Coordinates c=locable.getCoordinates();
	    try{
	    	emouse.mouseMove(c);
	    }catch(Exception e){
	    	
	    }
	    
	    WebElement profile = driver.findElement(By.xpath("//a[@class='nav_a' and contains(text(), 'Facebook')]"));
		profile.sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
        
	    wait(3);
	    profile.sendKeys();
		
		wait(5);
        
        driver.navigate().back();
	    
		/*WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
        wait(2);
	    
	    driver.findElement(By.id("email")).sendKeys("manojk2829@gmail.com");
		lo.info("User name Enter in User text Box");
		driver.findElement(By.id("pass")).sendKeys("maurya@282920");
		lo.info("User password Enter in Password text Box");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		lo.info("Now Click on Login Button.");
		wait(2);
		WebElement notification= dr.findElement(By.xpath("//a[contains(@class,'layerCancel')]"));
		notification.click();
		wait(2);
*/		
    }

 @AfterTest
 public void tearDown(){
        wait(10);
        driver.quit();
 }
}
