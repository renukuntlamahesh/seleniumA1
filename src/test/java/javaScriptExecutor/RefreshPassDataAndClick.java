package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPassDataAndClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.ebay.com/");
		Thread.sleep(2000);
		js.executeScript("history.go(0)");
		Thread.sleep(2000);
		WebElement searchTF=driver.findElement(By.id("gh-ac"));
		js.executeScript("window.location=arguments[1]",searchTF,"shoes");
		WebElement searchButton=driver.findElement(By.id("gh-btn"));
		js.executeScript("arguments[0].click()",searchButton);
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
