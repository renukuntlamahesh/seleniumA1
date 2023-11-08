package justTpoToTest;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchUserBrowserAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.out.println("enter your choice");
		Scanner s = new Scanner(System.in);
		String choice=s.next();
		switch(choice) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("invalid browser");
		}
             Thread.sleep(3000);
             driver.close();
	}

}
