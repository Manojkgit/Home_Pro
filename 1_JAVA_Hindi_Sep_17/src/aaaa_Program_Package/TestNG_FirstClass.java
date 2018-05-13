package aaaa_Program_Package;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_FirstClass {
	@Test(priority=1)
	public void Logintest1(){
		System.out.println("Test 1");
	}
	
	@Test(priority=2)
	public void Password_Change_test2(){
		System.out.println("Test 2");
		throw new SkipException("Skip this Test Case....");
	}
	
	@Test(dependsOnMethods ={"Password_Change_test2"}, priority=3)
	public void LogOut_test3(){
		System.out.println("Test 3");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Open page");
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("Closed Opened page");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method Open page");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method Open page");
	}

}
