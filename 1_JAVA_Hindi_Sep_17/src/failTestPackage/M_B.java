package failTestPackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class M_B {
	@Test
	public void M_B1(){
		System.out.println("test1 B1");
		throw new SkipException("Skip the test B 1...");
	}
	
	@Test
	public void M_B2(){
		System.out.println("test2 B2");
		Assert.assertTrue(false);
	}

}
