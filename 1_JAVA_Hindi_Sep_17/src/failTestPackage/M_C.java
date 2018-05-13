package failTestPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class M_C {
	
	@Test
	public void M_C1(){
		System.out.println("testC1 C1");
	}
	
	@Test
	public void M_C2(){
		System.out.println("testC2 C2");
		throw new SkipException("Skip the test C 1...");
	}

}
