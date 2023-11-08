package specialClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("mikemahesh2@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tr@velling143");
		driver.findElement(By.id("Login")).submit();
		Thread.sleep(5000);
		driver.findElement(By.className("MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z")).click();
		driver.close();
		

	}

}
