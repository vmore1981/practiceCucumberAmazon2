package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomepage;


public class AmazonTests {

	
	AmazonHomepage page = new AmazonHomepage();
	BrowserUtils utils = new BrowserUtils();
		
	@Given("go to amazon.com")
	public void go_to_amazon_com() {

		Driver.getDriver().get(DataReader.getProperty("url"));
	
	}
	
	
	@When("verify that you are on the home page")
	public void verify_that_you_are_on_the_home_page() {
	
		Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon.com. Spend less. Smile more."));
		
	}
	
	
	@When("search {string} and click search")
	public void search_and_click_search(String string) throws InterruptedException {
	
		page.searchInput.sendKeys(string, Keys.ENTER);
		Driver.getDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	
	}


	@When("wait for the element {string} to be visible - this could be any searched item or any text unique to the search page.")
	public void wait_for_the_element_to_be_visible_this_could_be_any_searched_item_or_any_text_unique_to_the_search_page(String string) {

		Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

		
}

	
	@When("get text of the search_criteria text element verify search_criteria matches the search input {string}")
	public void get_text_of_the_search_criteria_text_element(String string) {
		
		Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
		
	}


	
}