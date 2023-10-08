package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGD2 {

	@Test(groups = {"Smoke"})
	public void ThirdTest()
	{
		System.out.println("Good");
		System.out.println("Good");
		System.out.println("Good");
		
	}
	
	@Test(groups = {"Smoke"})
	public void ThirdTest1()
	{
		System.out.println("Good1");
		System.out.println("Good1");
		System.out.println("Good1");
		
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("Execute First Test");
	}
}
