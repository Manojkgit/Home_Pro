package eventListener;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static final Logger logger=Logger.getLogger(BaseTest.class);
	public WebDriver dr;
	public BaseTest(){
		String Path_Log_File = System.getProperty("user.dir")+"\\src\\eventListener\\log4.properties";
		PropertyConfigurator.configure(Path_Log_File);
	}
    public void openBro(String b){
    	if(b.equals("chrome")){
    		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
    		dr=new ChromeDriver();
    	}else{
    		dr=new FirefoxDriver();
    	}
    	logger.info("Open the browser --- > " + b);
    	dr.manage().window().maximize();
    	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	logger.info("Maximize the window size...");
    }
    
    public void wait(int s){
    	try{
    		Thread.sleep(s*1000);
    	}catch(Exception e){System.out.println(e.getMessage());
    	}
    	logger.info("Wait for locater --- > " + s  + " second.");
    }
}
