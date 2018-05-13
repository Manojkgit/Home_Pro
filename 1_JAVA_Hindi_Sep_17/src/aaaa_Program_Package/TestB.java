package aaaa_Program_Package;

import org.testng.annotations.Test;

public class TestB {
	@Test
	public void Test_B() throws InterruptedException{
		System.out.println("B start running");
		Thread.sleep(3000);
		System.out.println("B End");
	}
}
