package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGD4 {
	
	
	@Test
	public void WebHomelogin()
	{
		System.out.println("Web Home Login");
		//selenium
	}
	
	@Test
	public void WebHomelogin1()
	{
		System.out.println("Web Home Login1");
		//selenium
	}
	
	@Test
	public void MobileHomeLogin()
	{
		System.out.println("Mobile Home login");
		//Appium
	}
	
	@Parameters({"URL","APIKey/uname"})
	@Test(groups = {"Smoke"})
	public void LoginHomeapi(String urlName,String key)
	{
		System.out.println("API Home login");
		System.out.println(urlName+"  "+key);
		
		//Rest API login
	}

}
