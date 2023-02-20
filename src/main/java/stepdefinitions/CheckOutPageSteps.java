package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckOutPage;
import pages.SearchPage;

public class CheckOutPageSteps {
	
	CheckOutPage CheckOut = new CheckOutPage();
	
	@And("Click Cart")
	public void click_Cart() throws InterruptedException {
		CheckOut.clickCart();
	}

	@And("Click Delete")
	public void click_Delete() throws InterruptedException {
		CheckOut.clickDelete();
	}

	@Then("Close Browser")
	public void close_Browser() {
		CheckOut.quit();
	}


}
