package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
    
	@Parameters({"URL","APIKey"})
	@Test
	public void WebLoginHomeLoan(String urlname,String key) {
		System.out.println("WebLoginHome");
		System.out.println(urlname);
		System.out.println(key);
	}
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHome");
	}
	@Test(groups= {"Smoke"})
	public void ApiLoginHomeLoan() {
		System.out.println("ApiLoginHome");
	}
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I will exceute before every method of class day4");
	}
	@AfterMethod
	public void AfterEvery() {
		System.out.println("I will exceute after every method of class day4");
	}
	@BeforeClass
	public void bfclass() {
		System.out.println("I will run before running all methods of class day 4");
	}
   
	@AfterClass
	public void afclass() {
		System.out.println("I will run after running all methods of class day 4");
	}
}
