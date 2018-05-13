package log4j;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTest extends Test_Base_Log4j {
	public static final Logger loger = Logger.getLogger(Test_Base_Log4j.class.getName());
	
	@Test
	public void log() {
		loger.info("Start logging my test Information...");
		loger.info("Clicking on sign In button test Information...");
	}
}
