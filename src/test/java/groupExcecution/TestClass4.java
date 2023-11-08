package groupExcecution;

import org.testng.annotations.Test;

public class TestClass4 {
	
	@Test
	 public void demo1()
	 {
		System.out.println("TestClass4");
	 }
	
	
	@Test(groups = {"smoke", "regression", "sanity"})
	public void demo2()
	{
		System.err.println("TestClass4-->demo2-->smoke,regression and sanity");
		
	}
	public void demo3()
	{
		System.out.println("TestClass4");
	}
}


