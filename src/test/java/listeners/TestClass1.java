package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.ListenerImp.class)
public class TestClass1 extends BaseClass {
	
	@Test
	public void test0()
	{
		System.out.println("@Test-test0");
		
	}
	    
	
}
