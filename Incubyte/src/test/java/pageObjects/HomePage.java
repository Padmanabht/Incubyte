package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver hdriver;

	@FindBy(xpath = "//*[text()='Compose']")
	private WebElement compose;
	@FindBy(xpath = "//*[@id=':qg']")
	private WebElement recepientt;
	@FindBy(xpath = "//*[@name='subjectbox']")
	private WebElement subject;
	@FindBy(xpath = "//*[@id='':pd']")
	private WebElement body;
	@FindBy(xpath = "//*[@id=':nw']")
	private WebElement sendbtn;

	public HomePage(WebDriver driver) {
		this.hdriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCompose() {
		compose.click();
	}

	public void recepientadd() {
		recepientt.sendKeys("xyz@gmail.com");

	}

	public void sub() {
		subject.sendKeys("Incubyte");
		body.sendKeys("Automation QA test for Incubyte");
	}

	public void sendd() {
		sendbtn.click();
	}

}
