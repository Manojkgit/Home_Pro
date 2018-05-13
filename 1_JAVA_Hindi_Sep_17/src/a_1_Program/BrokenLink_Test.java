package a_1_Program;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_Test {
	public static WebDriver dr;
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chrome//chromedriver.exe");
		//ChromeOptions op = new ChromeOptions();
		//op.addArguments("--disable-extension");
		
		System.setProperty("webdriver.chrome.driver", "D://Browser_exe//chromedriver.exe");
		dr  = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("http://facebook.com");
		System.out.println(dr.getTitle());
		dr.findElement(By.id("u_0_9")).click();
	
		List<WebElement> link=dr.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++){
			System.out.println(link.get(i).getText());
			String url_Link = link.get(i).getAttribute("href");
			url_Test_OK(url_Link);
			//verifyBrokenLink(url_Link);//getURL_Verify(url_Link);
		}
		
		
		/*dr.findElement(By.id("Email")).sendKeys("skushwaha2829@gmail.com");
		dr.findElement(By.id("next")).click();
		dr.findElement(By.id("Passwd")).sendKeys("maurya@2829");
		dr.findElement(By.id("signIn")).click();
		System.out.println(dr.getTitle());*/
		Thread.sleep(3000);
		dr.quit();
	}

	public static void url_Test_OK(String urllink_Test){
		try{
			URL u=new URL(urllink_Test);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.setConnectTimeout(2000);
			con.connect();
			if(con.getResponseCode()==200){
				System.out.println(urllink_Test +" "+con.getResponseMessage());
			}
			if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(urllink_Test+" "+con.getResponseMessage()+ "   "+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}catch(Exception ex){
			
		}
	}
	public static void urlLinkTest(String linkURL){
		try{URL u=new URL(linkURL);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.setConnectTimeout(2000);
		con.connect();
		if(con.getResponseCode()==200){
			System.out.println(linkURL +"  "+ con.getResponseMessage());
		}else if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			System.out.println(linkURL+" "+ con.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void ht(String urllink){
		try{
			URL u=new URL(urllink);
    		HttpURLConnection con=(HttpURLConnection)u.openConnection();
	        con.setConnectTimeout(2000);
	        con.connect();
	        if(con.getResponseCode()==200){
	        	System.out.println(urllink + " "+ con.getResponseMessage());
	        }
	        if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
	        	System.out.println(urllink+" "+con.getResponseMessage()+"  "+HttpURLConnection.HTTP_NOT_FOUND);
	        }
	        
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public static void getURL_Verify(String Link_URL){
	    try{
	    	URL url=new URL(Link_URL);
	        HttpURLConnection urlconnection=(HttpURLConnection)url.openConnection();
	        urlconnection.setConnectTimeout(2000);
	        urlconnection.connect();
	        
	        if(urlconnection.getResponseCode()==200){
	        	System.out.println(Link_URL+ "   "+urlconnection.getResponseMessage());
	        }
	        if(urlconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	        {
	        	System.out.println(Link_URL+ "   "+urlconnection.getResponseMessage()+ " --- "+ HttpURLConnection.HTTP_NOT_FOUND);
	      
	    }
	}
	    catch(Exception ex){
	    	System.out.println(ex.getMessage());
	    }
} 
	
	public static void verifyBrokenLink(String url_Method_Link){
		 try
		 {
			 URL url=new URL(url_Method_Link);
	         HttpURLConnection urlcon=(HttpURLConnection)url.openConnection();
		     urlcon.setConnectTimeout(2000);
             urlcon.connect();

             if(urlcon.getResponseCode()==200){
            	 System.out.println(url_Method_Link +" -- " +urlcon.getResponseMessage());
             }
             
             if(urlcon.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
            	 System.out.println(url_Method_Link +" "+ urlcon.getResponseCode()+" -- " +urlcon.getResponseMessage()+"  -- "+ HttpURLConnection.HTTP_NOT_FOUND);
             }
		 }
		 catch(Exception ex){
			 System.out.println(ex.getMessage());
		 }
	
	}	
 }
