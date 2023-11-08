package crossBrowserParallel;

import org.testng.annotations.Test;

public class SwiggyTest extends BaseClass {
	@Test
	public void test0() throws InterruptedException {
	driver.get("https://www.swiggy.com/");
	Thread.sleep(3000);
	
	}

}
