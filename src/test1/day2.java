package test1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void ploan() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute at first");
	}
	@AfterSuite
	public void afsuite() {
		System.out.println("I am no. 1 from last");
	}

}
