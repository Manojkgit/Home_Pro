package a_1_Program;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Class {
	

	@Test(priority=0)
	public void manoj_TestNG_0(){
		System.out.println("Test 0");
	}
	
	@Test(priority=3)
	public void manoj_TestNG_3(){
		System.out.println("Test 3");
	}
	
	@Test(priority=1)
	public void manoj_TestNG_1(){
		System.out.println("Test 1");
	}
	@Test(priority=-6)
    public void c_method(){
    System.out.println("I'm in method -6 ");
    }
    @Test(priority=9)
    public void b_method(){
    System.out.println("I'm in method B");
    }
    @Test(priority=1)
    public void a_method(){
    System.out.println("I'm in method A");
    }
    @Test(priority=0)
    public void e_method(){
    System.out.println("I'm in method 0s");
    }
    @Test(priority=-2)
    public void d_method(){
    System.out.println("I'm in method -2");
    }
	
	/*@Test(priority=-2)
	public void manoj_TestNG_2(){
		System.out.println("Test -2");
	}*/
	
	
/*	@BeforeTest
	public void BeforeTest_manoj_TestNG(){
		System.out.println("Before Test");
	}
	
	@Test(groups={"sanity"})
	public void group_Test1_sanity(){
		System.out.println("Sanity");
	}
	
	@Test(groups={"Regrassion"})
	public void group_Test2_regrassion(){
		System.out.println("Ragrassion");
	}
	
	@Test(groups={"sanity","Regrassion"})
	public void group_Test1_sanity_regrassion(){
		System.out.println("Sanity and regrassion");
	}
	
	@Test(groups={"database"})
	public void group_Test2_database(){
		System.out.println("database");
	}
*/}
