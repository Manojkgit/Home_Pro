package aaaa_Program_Package;

import org.testng.annotations.Test;

public class TestA {
	@Test
	public void Test_A() throws InterruptedException{
		System.out.println("A start running");
		Thread.sleep(3000);
		System.out.println("A End");
	}

}
