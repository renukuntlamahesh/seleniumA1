package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//This is modified in git hub and verifying pull or not

public class SkillrarayLoginpage {
	
	@FindBy(xpath = "//a[text()=\"LOGIN\"]")
	private WebElement loginButton1;
	
	@FindBy(id = "email")
	private WebElement username1;
	
	@FindBy(id = "password")
	private WebElement password1;
	
	@FindBy(id = "last")
	private WebElement loginButton2;
	
	@FindBy(xpath = "//span[.=\"Users\"]")
	private WebElement users;
	
	@FindBy(xpath = "//a[.=\" New\"]")
	private WebElement newButton;
	
	@FindBy(id ="email")
	private WebElement username2;
	
	@FindBy(id = "password")
	private WebElement password2;
	
	@FindBy(id = "firstname")
	private WebElement firstName;
	
	@FindBy(id = "lastname")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement addr;
	
	@FindBy(id = "contact")
	private WebElement contact;
	
	@FindBy(name = "add")
	private WebElement saveButton;
	
	
	public SkillrarayLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickLoginButton1() {
		 loginButton1.click();;
	}

	

	public void setUsername1(String  un) {
		username1.sendKeys(un);
	}


	public void setPassword1(String pw) {
		password1.sendKeys(pw);
	}

	public void clickLoginButton2() {
		loginButton2.click();;
	}
	
	public void clickUsers() {
		users.click();
	}
	public void clickNewButton() {
		newButton.click();;
	}


	public void setUsername2(String un) {
		username2.sendKeys(un);
	}

	public void setPassword2(String  pw) {
		password2.sendKeys(pw);;
	}

	
	public void setFirstName(String  fn) {
		firstName.sendKeys(fn);
	}

	public void setLastName(String ln) {
	    lastName.sendKeys(ln);;
	}

	public void setAddr(String  addr) {
		this.addr.sendKeys(addr);
	}

	public void setContact(String contact) {
		this.contact.sendKeys(contact);
	}


	public void clickSaveButton() {
		saveButton.click();
	}
	

}


