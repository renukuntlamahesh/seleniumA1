package childBrowserPopus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Geolocation {

	public static void main(String[] args) throws InterruptedException {
		
ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-geolocation");

		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
