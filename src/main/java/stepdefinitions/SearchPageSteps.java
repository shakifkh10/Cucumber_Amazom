package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SearchPage;

public class SearchPageSteps {

	SearchPage Search = new SearchPage();

	@And("Enter Search {string}")
	public void enter_Search(String searchText) {
		Search.enterSearch(searchText);
	}

	@And("Click Search")
	public void click_Search() {
		Search.clickSearch();
	}

	@And("Click Search Result")
	public void click_Search_Result() throws InterruptedException {
		Search.clickSearchResult();
	}

	@Then("Click Add to cart")
	public void click_Add_to_cart() {
		Search.clickAddtoCart();

	}
}
