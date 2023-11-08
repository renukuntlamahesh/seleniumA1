package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomIntroductionSTEPS {
	        //declaration
			@FindBy (className="atLogoImg")
			private WebElement logo;
			
			@FindBy (id="username")
			private WebElement usernameTF;
			
			@FindBy (name="pwd")
			private WebElement passwordTF;
			
			@FindBy (id="keepLoggedINCheckBox")
			private WebElement keepLoggedINCheckBox;
			
			@FindBy (id="loginButton")
			private WebElement loginButton;
			
			@FindBy (id="toPasswordRecoveryPageLink")
			private WebElement forgotPasswordLink;
			
			//Initialization
			
			
			public PomIntroductionSTEPS(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			public WebElement getLogo() {
				return logo;
				
			}
			
		public void setUsername(String username)
		{
			usernameTF.sendKeys(username);
		}
		
		public void setPassword(String password)
		{
			passwordTF.sendKeys(password);
			
		}
		public void clickKeepMeLoggedCheckbox()
		{
			keepLoggedINCheckBox.click();
			
		}
		public void clickLoginButton()
		{
			loginButton.click();
		}
		public void clickForgotLinkButton() {
			forgotPasswordLink.click();
		}
	

	}

