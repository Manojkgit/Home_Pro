package failTestPackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunnerClass {
	
	public static void main(String[] args) {
		TestNG runner=new TestNG();
		List<String> listFail=new ArrayList<String>();
		runner.setTestSuites(listFail);
		listFail.add("C:\\Users\\ti01045\\SeleniumAutomation\\workspace\\1_JAVA_Hindi_Sep_17\\test-output\\Failed suite [ManojSuite]\\testng-failed.xml");
		runner.run();
	}
}
