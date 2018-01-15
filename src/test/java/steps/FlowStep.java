package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FilterPage;
import pageObjects.HomePage;
import utils.Context;
import verifier.FilterVerifier;
import verifier.SearchVerifier;

public class FlowStep {

	private HomePage homePage;
	private SearchVerifier searchVerifier;

	private Context context;
	private WebDriver driver;

	private FilterPage filterPage;
	private FilterVerifier filterVerifier;

	public FlowStep(Context context) {
		super();
		this.context = context;
		this.driver = context.getDriver();
		this.homePage = new HomePage(driver);
		this.searchVerifier = new SearchVerifier(driver);
		this.filterPage = new FilterPage(driver);
		this.filterVerifier = new FilterVerifier(driver);
	}

	@Given("^I enter a term in search (.*)")
	public void i_enter_a_term_in_search_Sailor_moon_tomo(String item) throws Throwable {
		this.homePage.enterSearch(item);
	}

	@Given("^I click on Search button$")
	public void i_click_on_Search_button() throws Throwable {
		this.homePage.clickOnSearchButton();
	}

	@Given("^I sort the list results by (.*)")
	public void i_sort_the_list_results_by_price_low_high(String value) throws Throwable {
		this.searchVerifier.verifyInPage();
		this.filterPage.showElements(value);
	}

	@When("^I click on the first element$")
	public void i_click_on_the_first_element() throws Throwable {
		//this.filterVerifier.verifyPage(sortOrder);
		this.filterPage.clickOnElement();

	}

	@Then("^The desctiption screen should be displayed$")
	public void the_desctiption_screen_should_be_displayed() throws Throwable {
	}

}
