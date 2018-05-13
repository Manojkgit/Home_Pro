package mukesh_Otwani;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Test {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
				WebDriver dr=new ChromeDriver();
				dr.get("http://facebook.com/");
				System.out.println(dr.getTitle());
				System.out.println(dr.getCurrentUrl());
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				Select value=new Select(dr.findElement(By.id("day")));
				WebElement BeforeSelect_Of_Value = value.getFirstSelectedOption();
				System.out.println("Selected First Value --- > "+ BeforeSelect_Of_Value.getText());
				
				List<WebElement> allValue = value.getOptions();
				System.out.println(allValue.size());
				for(WebElement ele:allValue){
					String task = ele.getText();
					System.out.println(task);
				}
				
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				for(int i=0;i<allValue.size();i++){
					System.out.println(allValue.get(i).getText());
				}
				System.out.println("******************************************");
				value.selectByVisibleText("19");
				WebElement SelectedValue = value.getFirstSelectedOption();
				System.out.println("Selected First Value --- > "+ SelectedValue.getText());
				/*
				List<WebElement> allValue = value.getAllSelectedOptions();
				System.out.println(allValue.get(index));
				System.out.println("*****************************************************");
				
				List<WebElement> valueOfList = dr.findElements(By.tagName("option"));
				System.out.println(valueOfList.size());
				for(int i=0;i<valueOfList.size();i++){
					System.out.println(valueOfList.get(i).getText());
				}*/
								
				System.out.println("Done");
				dr.quit();
	}

}
