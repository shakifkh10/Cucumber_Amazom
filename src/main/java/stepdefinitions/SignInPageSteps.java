package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageSteps {
	
	SignInPage SignIn = new SignInPage();
	
	@Then("Click Hello Sign In")
	public void click_Hello_Sign_In() {
		SignIn.clickHelloSignIn();
	}

	@And("Enter email {string}")
	public void enter_email(String user) {
		SignIn.enterEmail(user);
	}
	

	@And("Enter continue")
	public void enter_continue() {
		SignIn.clickContinue();
	}

	@And("Enter password {string}")
	public void enter_password(String pass) {
		SignIn.enterPassword(pass);
	}

	@Then("Click Sign In")
	public void click_Sign_In() throws InterruptedException {
		SignIn.clickSignIn();
	}

}
