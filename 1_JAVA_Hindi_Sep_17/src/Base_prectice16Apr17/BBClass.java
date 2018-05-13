package Base_prectice16Apr17;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BBClass {
	  public Properties pro;
	  public WebDriver dr;
	  public void in(){
		pro =new Properties();
		try{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\config.properties");
			pro.load(fis);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		System.out.println(pro.getProperty("AppURL"));
	}
	  
	public void  navigate(String url)
	{
		dr.get(pro.getProperty(url));
	}
	public void openBro(String bName){
		if(bName.equalsIgnoreCase("Firefox")){
			dr = new FirefoxDriver();
		}else{
			System.setProperty("webdriver.chrome.driver", pro.getProperty("Bro_EXE"));
			dr = new ChromeDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void readPath(){
	  in();	
	  openBro("chrome");
	  navigate("AppURL");
	}
	
	
	
}
