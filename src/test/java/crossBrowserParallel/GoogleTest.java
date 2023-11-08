package crossBrowserParallel;

import org.testng.annotations.Test;

public class GoogleTest extends BaseClass {
	
	@Test
	public void test0() throws InterruptedException {
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
	}

}
