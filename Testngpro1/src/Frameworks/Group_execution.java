package Frameworks;

import org.testng.annotations.Test;

public class Group_execution {

	@Test(groups= {"Sanity","Regression"})
	public void eduloan()
	{
		System.out.println("for education");
	}
	@Test(groups= {"sanity","Regression"})
	public void marriageloan()
	{
		System.out.println("for marriage...");
	}
	@Test(groups= {"System","Regression"})
	public void gold()
	{
		System.out.println("for gold...");
	}
	@Test(groups= {"smoke","Regression"})
	public void  carloan()
	{
		System.out.println("car loan...");
	}
}
