package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillrareTest {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SkillrarayLoginpage login=new SkillrarayLoginpage(driver);
		
		login.clickLoginButton1();
		login.setUsername1("admin");
		login.setPassword1("admin");
		login.clickLoginButton2();
		login.clickUsers();
		Thread.sleep(3000);
		login.clickNewButton();
		//Thread.sleep(3000);
		login.setUsername2("mikemahesh2@gmail.com");
		login.setPassword2("Tr@velling143");
		login.setFirstName("mahi");
		login.setLastName("vip");
		login.setAddr("hyderabad tankband");
		login.setContact("7337074217");
		Thread.sleep(3000);
		login.clickSaveButton();
		Thread.sleep(3000);
		driver.close();
		
     
	}

}
