package windowScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotnormal {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshotss/hotstarscreenshot/.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
