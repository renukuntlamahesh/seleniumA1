package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	
	@BeforeSuite
	public void suiteconfi() 
	{
		System.out.println("BeforeTest");
		
	}
	
	
	@BeforeTest
	public void testConfi()
	{
		System.out.println("BeforeTest");
	}
	
	
	@BeforeClass
	public void classConfi()
	{
		System.out.println("BeforeClass");
	}
	
	
	@BeforeMethod
	public void methodConfig()
	{
		System.out.println("BeforeMethod");
	}
	
	
	@AfterMethod
	public void methodConfi() 
	{
		System.out.println("AfterMethod");
	}
	

	@AfterClass
	public void classTearDown()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void testTearDown() 
	{
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void suiteTearDown() 
	{
		System.out.println("AfterSuite");
	}
		
	}

