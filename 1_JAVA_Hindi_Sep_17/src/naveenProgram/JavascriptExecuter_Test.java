package naveenProgram;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuter_Test {

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
        WebElement password = dr.findElement(By.name("pass"));
        /*//hightighterBoarder(dr, password);
        System.out.println(getTitle(dr));
        boderTextBOx(password, dr);
        //scrollDown_JS(dr);
        WebElement help = dr.findElement(By.xpath("//a[contains(text(),'Help')]"));
        scrollDown_True_View(dr, help);
        boderTextBOx(help, dr);
        WebElement login = dr.findElement(By.xpath("//input[@value='Log In']"));
        scrollDown_True_View(dr, login);
        boderTextBOx(login, dr);
        System.out.println(getInnerText(dr));
        //click_BY_JS(dr, login);
        
        //getAlert(dr, "msg");
        screen(dr);*/
        
	}

/*	public static void click_BY_JS(WebDriver dr, WebElement e){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("arguments[0].click();", e);
	}
	
	public static void screen(WebDriver dr){
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("D://report//A.jpg"));
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public static void hightighterBoarder(WebDriver dr,WebElement ele){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("arguments[0].style.border='4px solid red'", ele);
	}
	
	public static void JavaScript_Alert_Message(WebDriver dr,String msg){
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("alert('"+msg+"')");
	}
	
	public static String getTitle(WebDriver dr){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getInnerText(WebDriver dr){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		String innerText = js.executeScript("return document.documentElement.innerText;").toString();
		return innerText;
	}
	
	public static void getAlert(WebDriver dr,String msg){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("alert('"+msg+"')");
	}
	
	public static void boderTextBOx(WebElement ele,WebDriver dr){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].style.border='4px solid red'", ele);
	}
	
	public static void scrollDown_JS(WebDriver dr){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollDown_True_View(WebDriver dr,WebElement ele){
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}*/

}
