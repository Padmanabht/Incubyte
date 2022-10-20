package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.BaseClass;

public class EmailStepDef extends BaseClass {

	WebDriver driver;
	LoginPage LP;
	HomePage HP;
	BaseClass Bs;

	@Given("^User launches browser$")
	public void browserLaunch() {
		this.Bs = new BaseClass();
		this.driver = Bs.Initialization();

	}

	@And("^User is logged in gmail with Email ID \"abc@gmail.com\" and password \"password_1\"$")
	public void login() {
		this.LP = new LoginPage(driver);
		driver.get("https://mail.google.com/");	
		LP.login();

	}
	@When("^User clicks on compose button$")
	public void compose() {
		this.HP = new HomePage(driver);
		HP.clickCompose();
	}
	@And("^User enters recepients Email Id \"xyz@gmail.com\"$")
	public void recepientAddr() {
		HP.recepientadd();
	}

	@And("^User enters subject \"Incubyte\" & body \"Automation QA test for Incubyte\"")
	public void data() {
		HP.sub();
	}
	@Then("^User clicks on send button")
	public void sendMail() {
		HP.sendd();
	}
}
