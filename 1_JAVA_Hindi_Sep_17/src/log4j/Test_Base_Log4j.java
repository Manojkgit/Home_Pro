package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class Test_Base_Log4j {
     public static final Logger loger = Logger.getLogger(Test_Base_Log4j.class.getName());
     
     @BeforeTest
     public void loggerMethod(){
    	 String log4jPath  = System.getProperty("user.dir")+"\\src\\log4j\\log4j.properties";
    	 PropertyConfigurator.configure(log4jPath);
     }
     
}
