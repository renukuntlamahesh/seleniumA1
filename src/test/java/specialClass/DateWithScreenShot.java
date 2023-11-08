package specialClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class DateWithScreenShot {
	public static String getDateAndTime()
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
		return sdf.format(date);
	}
	
		
		public static void main(String[] args) throws IOException, InterruptedException {
			

			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.ajio.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			String date=getDateAndTime();
			
			Screenshot ss=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			ImageIO.write(ss.getImage(),"PNG",new File("./Screenshots/fullpage"+date+".png"));
			
			Thread.sleep(2000);
			driver.close();
			
			


	}

}
