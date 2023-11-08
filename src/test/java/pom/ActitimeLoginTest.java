package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginTest {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PomIntroductionSTEPS login=new PomIntroductionSTEPS(driver);
		
		if(login.getLogo().isDisplayed())
		System.out.println("login page is displayed");
		
		
		login.setUsername("admin");
		login.setPassword("manager");
		login.clickLoginButton();
		login.clickKeepMeLoggedCheckbox();
		
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		driver.close();
		
	}

}
