package zzzzzzz_POM;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base_POM {
	public Properties pro;
	public WebDriver dr;
    public Xls_Reader xls;
	public ExtentReports ext=ExtentReport_DDF.extentReport();
	public ExtentTest test;
	public static final Logger log=Logger.getLogger(Base_POM.class.getName());
	public Base_POM(WebDriver dr,ExtentTest test){
		this.dr=dr;
		this.test=test;
	}
	public Base_POM(){
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\zzzzzzz_POM\\log4j.properties");
		init();
		xls=new Xls_Reader(pro.getProperty("ExcelPath"));
	}
	
	public void init(){
		pro=new Properties();
		try{FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\zzzzzzz_POM\\or.properties");
		pro.load(fis);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(pro.getProperty("appurl"));
		log.info("Innitialized the Properties" + getClass().getName());
		
	}
	
	public void openBro(String b){
		System.setProperty("webdriver.chrome.driver", pro.getProperty("Browser_exe"));
		if(b.equals("chrome")){
			dr=new ChromeDriver();
			log.info("Chrome Browser Opened");
		}else{
			dr=new FirefoxDriver();
			log.info("Firefox Browser Opened");
		
		}
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().deleteAllCookies();
		log.info("Browser maximize");
	}
	
	public void navigate(String u){
		dr.get(u);
		test.log(LogStatus.INFO,"URL opened --- " + pro.getProperty("appurl"));
		log.info("Navigate the Browser -- > " + pro.getProperty(u));
	}
	
	public void inputT(String locter,String d){
		getElement(locter).sendKeys(d);
	}
	
	public void inputType_Click(String locater){
		getElement(locater).sendKeys(Keys.ENTER);
	}
	
	public WebElement getElement(String loc){
		WebElement w=null;
		if(loc.endsWith("_id")){
			w=dr.findElement(By.id(pro.getProperty(loc)));
		}else if(loc.endsWith("_name")){
			w=dr.findElement(By.name(pro.getProperty(loc)));
		}else if(loc.endsWith("_xpath")){
			w=dr.findElement(By.xpath(pro.getProperty(loc)));
		}else {
			reportFail("Locater not found");
			Screen();
		}
		return w;
	}
	
	public void reportFail(String msg){
		System.out.println("Somthingwent Wrong report fail");
	}
	
	public void Screen(){
		Date d=new Date();
		String FN=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//report//"+FN));
	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
	test.log(LogStatus.INFO, "Taje Screen Shot --- > " + 
	test.addScreenCapture(System.getProperty("user.dir")+"//report//"+FN));	
	log.info("take Screen Shot ---- >  ");

		
 }
	
	
	
	
	
	
	
}