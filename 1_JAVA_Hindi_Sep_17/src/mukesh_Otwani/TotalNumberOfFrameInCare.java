package mukesh_Otwani;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalNumberOfFrameInCare {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://care.d2h.com/cms/default.aspx");
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.findElement(By.name("txtUserName")).sendKeys("careadmin1");
		dr.findElement(By.name("txtPassword")).sendKeys("bbcl@gr1");
		//dr.findElement(By.name("txtPassword")).sendKeys(Keys.ENTER);
		WebElement password =dr.findElement(By.name("txtPassword"));
		getHighligter(dr, password);
		Thread.sleep(3000);
		int totalFrame = dr.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrame);
		System.out.println(")))))))))))))))))))))))))))))))))))))))))");
		List<WebElement> totalFrame_List = dr.findElements(By.tagName("iframe"));
		System.out.println(totalFrame_List.size());

		/*Select value = new Select(dr.findElement(By.xpath("")));
	             List<WebElement> text = value.getOptions();
	             for(int i=0;i<text.size();i++){
	            	 System.out.println(text.get(i).getText());
	             }*/


	}

	public static void getHighligter(WebDriver dr,WebElement ele){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].style.border='5px solid red'", ele);
		try{
			Thread.sleep(4000);  
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].style.border='5px solid white'", ele);
	}

}


