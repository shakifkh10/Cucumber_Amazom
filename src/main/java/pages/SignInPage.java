package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrapper.GenericWrappers;

public class SignInPage extends GenericWrappers {

	public SignInPage clickHelloSignIn() {
		clickById("nav-link-accountList");
		return this;

	}

	public SignInPage enterEmail(String user) {
		enterById("ap_email", user);
		return this;
	}

	public SignInPage clickContinue() {
		clickById("continue");
		return this;
	}

	public SignInPage enterPassword(String pass) {
		enterById("ap_password", pass);
		return this;
	}

	public SearchPage clickSignIn() throws InterruptedException {
		clickById("signInSubmit");
		Thread.sleep(20000);
		return new SearchPage();

	}
}