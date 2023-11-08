package mouseActionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

 WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 2']"));

 WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 1']"));
Thread.sleep(3000);
 Actions action=new Actions(driver);
Thread.sleep(3000);
 action.dragAndDrop(block1, block4).perform();
 Thread.sleep(3000);
 driver.close();
	 }

}
