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
	public void SecondTest()
	{
		System.out.println("Bye");
		System.out.println("Bye Bye");
		System.out.println("Bye Bye Bye");
	}

}
