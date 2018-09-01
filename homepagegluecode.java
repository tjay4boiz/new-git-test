package gluecode_stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector1;

public class homepagegluecode extends WebConnector1{

	@Given("that I am on the home page")
	public void that_I_am_on_the_home_page() {
		driver.get(baseUrl);
	   
	}
		
	@Then("I should see {string} title")
	public void i_should_see_title(String expectedTitle) {
	    Assert.assertEquals(expectedTitle, driver.getTitle());
	
		}    
	
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		driver.get(baseUrl);
	}
	
	@When("I click on {string} button")
	public void i_click_on_button(String string) {
		driver.findElement(By.xpath(string)).click();
	   
	}
	
	@Then("I should key in username and password")
	public void i_should_key_in_username_and_password() {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello@hello.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hello1234"); }
	
	@Then("I should click on sign in")
	public void i_should_key_in_username_password_to_sign_in() {
	driver.findElement(By.xpath("//button[@class='ui-component__rounded-icon-button']")).click();
	}
	
	@Then("the page url should contain {string}")
	public void the_page_url_should_contain(String locator) {
		driver.findElement(By.xpath(locator)).click();
	 
	}
}