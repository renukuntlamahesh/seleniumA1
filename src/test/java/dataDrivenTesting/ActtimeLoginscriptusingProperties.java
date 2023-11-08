package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActtimeLoginscriptusingProperties {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(read("url"));
		long time=Long.parseLong(read("timeouts"));
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(read("admin"));
		driver.findElement(By.name("pass")).sendKeys(read("manager"));
		driver.findElement(By.id("u_0_5_Wi")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,time);
		
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		driver.close();
	}
		public static String read(String key)
		{
			FileInputStream fis=null;
			try {
				fis=new FileInputStream("./src/main/resources/chromedriver.exe");
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();	
			}
			Properties property=new Properties();
			try {
				property.load(fis);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		return property.getProperty(key);

	}

}
