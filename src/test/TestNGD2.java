package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGD2 {

	@Test(groups = {"Smoke"})
	public void ThirdTest()
	{
		System.out.println("Good");
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("Execute First Test");
	}
}
