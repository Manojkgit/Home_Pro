package eventListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyListener extends AbstractWebDriverEventListener {
    public void afterNavigateBack(WebDriver driver){
    	System.out.println("after NavigateBack -- We will be navigate Back." );
    }
    
    public void beforeNavigateBack(WebDriver driver){
    	System.out.println("before NavigateBack -- We will be navigate Back." );
    }
}
