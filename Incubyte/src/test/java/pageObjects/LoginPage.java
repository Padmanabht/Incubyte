package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	@FindBy(xpath = "//*[@id='identifierId']")
	private WebElement email;
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nxtbtn;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;

	public LoginPage(WebDriver driver) {
		this.ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		email.sendKeys("abc@gmail.com");
		nxtbtn.click();
		password.sendKeys("password_1");
		nxtbtn.click();
	}

}
