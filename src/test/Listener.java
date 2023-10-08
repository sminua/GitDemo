package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {

		ITestListener.super.onTestSuccess(result);
		//                       System.out.println("Successfully executed listeners Pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		ITestListener.super.onTestFailure(result);
		System.out.println("Successfully executed listeners Failure code due to test case - "+result.getName());
		
	}

	
}
