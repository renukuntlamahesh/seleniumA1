package specialClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.className("sc-s1isp7-5 fyZwWD"));
		Thread.sleep(3000);
		File src=element.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File ("./Screenshotss/"+element.getText()+".png");
		Thread.sleep(3000);
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		driver.close();
		

	}

}
