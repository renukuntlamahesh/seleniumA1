package specialClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	     WebElement electronic =driver.findElement(By.partialLinkText("COMPUTERS"));

		Actions action =new Actions(driver);
		Thread.sleep(3000);

		action.moveToElement(electronic).perform();
		Thread.sleep(2000);
		
		WebElement dropdown1=driver.findElement(By.id("products-orderby"));
		Select select=new Select(dropdown1);
		
		


	}

}
