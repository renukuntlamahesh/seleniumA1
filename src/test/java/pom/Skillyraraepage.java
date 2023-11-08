package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillyraraepage
{
	@FindBy (xpath="//a[text()=\"LOGIN\"]")
	private WebElement loginButton;


    @FindBy (id = "email")
    private WebElement usernameTF;
    
    @FindBy (id = "password")
    private WebElement passwordTF;
    
    @FindBy (id = "last")
    private WebElement loginnButton;
    
    @FindBy (xpath = "//span[.=\"Users\"]")
    private WebElement user;
    
    @FindBy (xpath = "//a[@class=\"btn btn-primary btn-sm btn-flat\"]")
    private WebElement plusnewpress;
    
    @FindBy (id = "email")
    private WebElement emailTF;
    
    @FindBy (id = "password")
    private WebElement passwordTF1;
    
    @FindBy (id = "firstname")
    private WebElement firstnameTF;
    
    @FindBy (id = "address")
    private WebElement addressTF;
    
    @FindBy (name = "add")
    private WebElement save;
    
    
	public Skillyraraepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void clickloginButton() 
	{
	 loginButton.click();
	
	}
	public void setUsername(String username)
	{
		usernameTF.sendKeys(username);
	}
     
	public void setpassword(String password)
	{
		passwordTF.sendKeys(password);
	}
	public void loginnButton()
	{
		loginnButton.click();
	}
	public void users()
	{
		user.click();
	}
	public void plus()
	{
		plusnewpress.click();
	}
	public void setemail(String email1)
	{
		emailTF.sendKeys(email1);
	}
	public void setpassword0(String password0)
	{
		passwordTF1.sendKeys(password0);
	}
	public void setfirstname0(String firstname0)
	{
		firstnameTF.sendKeys(firstname0);
	}
	
	public void setaddress(String address)
	{
		addressTF.sendKeys(address);
	}
	public void save()
	{
		save.click();
	}


	
}