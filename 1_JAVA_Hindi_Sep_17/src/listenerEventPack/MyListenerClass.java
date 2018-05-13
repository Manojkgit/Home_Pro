package listenerEventPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyListenerClass extends AbstractWebDriverEventListener{
     public void beforeClickOn(WebElement ele,WebDriver dr){
    	 System.out.println("This method call before click any Event.");
     }
     
     public void afterClickOn(WebElement ele,WebDriver dr){
    	 System.out.println("This method invoke After click on any element");
     }
     
     public void beforeFindBy(By by,WebElement ele,WebDriver dr){
    	 System.out.println("This method invoke before finding((FindElement/findElements)) any Element from page Event.");
     }
     
     public void afterFindBy(By by,WebElement ele,WebDriver dr){
    	 System.out.println("This method invoke After finding(FindElement/findElements) any Element from page Event.");
     }
     
     /************************Old My Listener Properties***************************/
     public void afterNavigateBack(WebDriver driver){
     	System.out.println("after NavigateBack -- We will be navigate Back." );
     }
     
     public void beforeNavigateBack(WebDriver driver){
     	System.out.println("before NavigateBack -- We will be navigate Back." );
     }
}
