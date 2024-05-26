package test1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute at last of all TCs of this module");
	}

	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Hello world");
		Assert.assertTrue(false);
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Bye");
		
	}
	
	
}
