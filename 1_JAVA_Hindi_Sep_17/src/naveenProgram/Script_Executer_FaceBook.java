package naveenProgram;

import java.awt.image.TileObserver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Executer_FaceBook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//ChromeDriver.exe");
        WebDriver dr = new ChromeDriver();
        
		dr.get("https://www.facebook.com/");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.findElement(By.name("email")).sendKeys("manojk2829@gmail.com");
        dr.findElement(By.name("pass")).sendKeys("maurya@282920");
        //dr.findElement(By.name("pass")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement LogIn=dr.findElement(By.xpath("//input[@value='Log In']"));
        /*WebElement border =dr.findElement(By.name("pass")); 
        
        Border_JS(border,dr);
        System.out.println(getTitle(dr));
        //System.out.println(Get_innerText(dr));
        refresh_JS(dr);
        
        ScrollDown(dr);
        
*/      
        WebElement help = dr.findElement(By.xpath("//a[contains(text(),'Help')]"));
        scroll_till_View_JS(dr, help);
        Border_JS(help, dr);
        Thread.sleep(2000);
        scroll_till_View_JS(dr,LogIn);
        Border_JS(LogIn, dr);
        //Click_JS(dr, LogIn);
        

        System.out.println("Scroll Done....");
	}
	
	public static void alert_JS(WebDriver dr,String m){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("alert('"+m+"')");
	}
	
	public static void Click_JS(WebDriver dr,WebElement el){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("arguments[0].click();",el);
	}
	
	public static void Border_JS(WebElement el,WebDriver dr){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].style.border='4px solid red'",el);
	}
	
	public static void boderTextBOx(WebElement ele,WebDriver dr){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].style.border='4px solid red'", ele);
	}

	public static void scroll_till_View_JS(WebDriver dr,WebElement el){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("arguments[0].scrollIntoView(true);",el);
	}
	

	public static void scrollDown_True_View(WebDriver dr,WebElement ele){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
	public static void ScrollDown(WebDriver dr){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static String getTitle(WebDriver dr){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String Get_innerText(WebDriver dr){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		String innertext = js.executeScript("return document.documentElement.innerText;").toString();
		return innertext;
	}
	
	public static void refresh_JS(WebDriver dr){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("history.go(0)");
	}
}
