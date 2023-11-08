package batchExcecution;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void demo1() 
	{
		System.out.println("TestClass 1-----> demo-1");
	}
	@Test
	public void demo2()  
	{
		System.out.println("TestClass 1-----> demo-2");
//	Assert.fail();
		
	}
}
