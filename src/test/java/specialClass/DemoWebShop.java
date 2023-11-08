package specialClass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("renukuntla");
		driver.findElement(By.id("LastName")).sendKeys("mahi");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("mikemahesh2@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("123456"+Keys.TAB+"123456"+Keys.ENTER);
		driver.findElement(By.id("register-button")).submit();
		Thread.sleep(3000);
		
		//driver.close();
		WebElement text =driver.findElement(By.xpath("//li[text()=\"The specified email already exists\"]"));
		System.out.println(text.getText());
		driver.close();

	}

}
