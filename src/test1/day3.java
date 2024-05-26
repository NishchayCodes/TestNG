package test1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class day3 {
	
	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String url) {
		System.out.println("WebLoginCar");
		System.out.println(url);
	}
	@Test(groups= {"Smoke"})
	public void WebSigninCarLoan() {
		System.out.println("WebSigninCar");
	}
	@Test(dataProvider="getData")
	public void WebSignoutCarLoan(String uname,String pwd) {
		System.out.println("WebSignoutCar");
		System.out.println(uname);
		System.out.println(pwd);
	}
	@Test(enabled=false)
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCar");
	}
	@Test(dependsOnMethods= {"WebSignoutCarLoan"})
	public void ApiLoginCarLoan() {
		System.out.println("ApiLoginCar");
		
	}
	@BeforeSuite
	public void bfsuite() {
		System.out.println("I am the no. 1");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		//1st combination
		data[0][0]="firstusername";
		data[0][1]="firstpwd";
		//2nd combination
		data[1][0]="secondusername";
		data[1][1]="secondpwd";
		//3rd combination
		data[2][0]="thirdusername";
		data[2][1]="thirdpwd"; 
		
		return data;
		
	}
	

}
