package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGD1 {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("Execute Last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void TestDemo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
		System.out.println("Bye Bye");
		System.out.println("Bye Bye Bye");
		//changes
		System.out.println("Bye4");
		System.out.println("Bye5");
		System.out.println("Bye6");
		System.out.println("Bye7");
		
	}

}
