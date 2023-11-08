package windowScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.partialLinkText("https://img.hotstar.com/image/upload/v1656431456/web-images/logo-d-plus.svg"));
		File src =element.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/webelement.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.close();

	}

}
