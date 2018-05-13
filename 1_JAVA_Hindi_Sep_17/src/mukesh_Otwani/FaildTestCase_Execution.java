package mukesh_Otwani;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class FaildTestCase_Execution {

  public static void main(String[] a){
		TestNG runner = new TestNG();
		List<String> listOffail = new ArrayList<String>();
		listOffail.add("C:\\Users\\ti01045\\SeleniumAutomation\\workspace\\1_JAVA_Hindi_Sep_17\\test-output\\My_New_Fail_Suite\\testng-failed.xml");
	    runner.setTestSuites(listOffail);
		runner.run();
	}
}
