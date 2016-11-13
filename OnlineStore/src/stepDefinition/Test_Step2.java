package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Step2 {
	public static WebDriver driver;
	/**
	 * Feature of User purchase an item 
	 */
	@Given("^User is on an item details page")
	public void user_is_on_an_item_details_page() throws Throwable{
		// replace the webdriver path here 
		System.setProperty("webdriver.chrome.driver", "/Users/xcpeng/Desktop/*/SQA3/Online_Shopping_SQA3/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/products-page/product-category/n/");
		System.out.println("Now user is on item detail page");
	}
	
	@When("^User click add to cart$")
	public void user_click_add_to_cart() throws Throwable {
		driver.findElement(By.className("input-button-buy")).click();
		System.out.println("Now user can go to checkout");
	}
	
	@And("^User choose go to checkout$")
	public void user_choose_go_to_checkout() throws Throwable {
		driver.findElement(By.className("go_to_checkout")).click();
		System.out.println("User go to checkout page");
	}
	
	@Given("^User is on an checkout page$")
	public void user_is_on_an_checkout_page() throws Throwable{
		System.out.println("User is now on checkout page");
	}
	
	@When("^User click continue$")
	public void user_click_continue() throws Throwable {
		driver.findElement(By.className("step2")).click();
	}
	
	@Then("^Message display user is now on checkout form$")
	public void message_display_user_is_now_on_checkout_form() throws Throwable {
		System.out.println("User is now on checkout form");
	}
	
	@When("^User fill out the form$")
	public void user_fill_out_the_form() throws Throwable {
		driver.findElement(By.id("wpsc_checkout_form_9")).sendKeys("xup4@pitt.edu");
		driver.findElement(By.id("wpsc_checkout_form_2")).sendKeys("1234");
		driver.findElement(By.id("wpsc_checkout_form_3")).sendKeys("1234");
		driver.findElement(By.id("wpsc_checkout_form_4")).sendKeys("1234");
		driver.findElement(By.id("wpsc_checkout_form_5")).sendKeys("1234");
		driver.findElement(By.id("wpsc_checkout_form_6")).sendKeys("1234");
		driver.findElement(By.id("wpsc_checkout_form_7")).sendKeys("AF");
		System.out.println("User is filling the form");
		driver.findElement(By.id("wpsc_checkout_form_18")).sendKeys("1234");
		driver.findElement(By.id("wpsc_checkout_form_15")).sendKeys("1234");
	}
	
	@Given("^User filled out the form$")
	public void user_filled_out_the_form() throws Throwable {
		System.out.println("User has filled out the form");
	}
	
	@And("^User click on purchase$")
	public void user_click_on_purchase() throws Throwable {
		driver.findElement(By.className("make_purchase")).click();
	}
	
	@Then("^Message display user purchase complete$")
	public void message_display_user_purchase_complete() throws Throwable {
		System.out.println("User purchase complete$");
	}
}
