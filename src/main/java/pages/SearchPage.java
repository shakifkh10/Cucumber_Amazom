package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrapper.GenericWrappers;

public class SearchPage extends GenericWrappers {

	// if(!verifyTitle("ToolsQA")){
	// reportStep("This is not Books page", "Fail");

	public SearchPage enterSearch(String searchText) {
		enterById("twotabsearchtextbox", searchText);
		return this;
	}

	public SearchPage clickSearch() {
		clickById("nav-search-submit-button");
		return this;
	}

	public SearchPage clickSearchResult() throws InterruptedException {
		clickByXpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']");
		// clickByXpath("//div[@class='s-product-image-container aok-relative
		// s-text-center s-image-overlay-grey s-padding-left-small s-padding-right-small
		// puis-spacing-small s-height-equalized']");
		Thread.sleep(5000);
		return this;

	}

	public CheckOutPage clickAddtoCart() {
		clickById("add-to-cart-button");
		return new CheckOutPage();

	}

}
