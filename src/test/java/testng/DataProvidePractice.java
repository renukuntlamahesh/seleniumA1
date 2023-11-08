package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidePractice {
	
	@Test(dataProvider = "data")
	public  void bookTicketTest(String source,String dest)
	{
		System.out.println("From :" +source+ "\tTo:" +dest);
	}
	 
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj =new Object[3][2];
		
		obj[0][0]="Hyd";
		obj[0][1]="ladakh";
		
		
		obj[1][0]="ladakh";
		obj[1][1]="leh";
		
		obj[2][0]="leh";
		obj[2][1]="J&K";
		
		return obj;
		
    }
	

}
