package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGD3 {
	
	@BeforeClass
	public void BClass()
	{
		System.out.println("Before executing any methods in Class");
	}
	
	@AfterSuite
	public void ASuite()
	{
		System.out.println("Last Suite");
	}
	
	@Parameters({"URL"})
	@Test
	public void WebLoginCar(String urlName)
	{
		System.out.println("Web Login Car");
		System.out.println(urlName);
		//selenium
	}
	
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("Execute before every @Test method in TESTNGD3 class");
	}
	
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("Execute after every @Test method in TESTNGD3 class");
	}
	
	@AfterClass
	public void AClass()
	{
		System.out.println("After executing all methods in Class");
	}
	
	@Test
	public void MobileLoginCar()
	{
		System.out.println("Mobile login Car");
		//Appium
	}
	
	@BeforeSuite
	public void BSuite()
	{
		System.out.println("First Suite");
	}
	
	@Test(enabled = true)
	public void MobileSigninCar()
	{
		System.out.println("Mobile sign in Car");
		//Appium
	}
	
	@Test(dataProvider = "getData")
	public void MobileSignoutCar(String uname,String pwd)
	{
		System.out.println("Mobile sign out Car");
		System.out.println("Username: "+uname+" Password: "+pwd);
		
		//Appium
	}
	
	@Test(dependsOnMethods = {"WebLoginCar","MobileLoginCar"})
	public void LoginAPICar()
	{
		System.out.println("API login Car");
		//Rest API login
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstsetuname";
		data[0][1]="firstpassword";
		//2nd set
		data[1][0]="secondsetuname";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
		
	}

}
