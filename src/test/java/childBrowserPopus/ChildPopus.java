package childBrowserPopus;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(" //a[text()=\" GEARS \"] ")).click();
		driver.findElement(By.xpath("//ul[@class]/descendant::a[text()=\" SkillRary Essay\"]")).click();
		
		String parentID=driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
	    
		for(String wid:ids) {
			driver.switchTo().window(wid);
		}
		
	driver.findElement(By.id("mytext")).sendKeys("Nikhil Andhagadu");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
	driver.close();
	
driver.switchTo().window(parentID);

driver.findElement(By.name("q")).sendKeys("core java");
driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();

Thread.sleep(2000);
driver.close();
}
}