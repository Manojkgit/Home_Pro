package interviewPractise;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDownListValue {

	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.get("http://executeautomation.com/demosite/index.html");
		System.out.println(dr.getTitle());
		List<WebElement> dropList=dr.findElements(By.id("TitleId"));
		for(int i=0;i<dropList.size();i++){
			System.out.println(dropList.get(i).getText());
		}

		List<WebElement> AllLink=dr.findElements(By.tagName("a"));
		System.out.println(AllLink.size());
		for(int i=0;i<AllLink.size();i++){
			System.out.println(AllLink.get(i).getText());
		}
		
		
        try{
        	Thread.sleep(5);
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
        
        dr.quit();
		
	}
}
