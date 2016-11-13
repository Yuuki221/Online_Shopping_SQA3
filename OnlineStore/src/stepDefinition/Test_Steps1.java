package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps1 {
	public static WebDriver driver;
	
	/**
	 * Second Story:
	 * I want to login so that I can add one item to cart and remove it  
	 */
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		// replace the path of webdriver here 
		System.setProperty("webdriver.chrome.driver", "/Users/xcpeng/Desktop/*/SQA3/Online_Shopping_SQA3/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		System.out.println("User is on home page now");
	}
	
	@When("^User go to login page$")
	public void user_go_to_login_page() throws Throwable {
		driver.findElement(By.id("account")).click();
	}
	
	@And("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable{
		driver.findElement(By.id("log")).sendKeys("testuser_434");
		driver.findElement(By.id("pwd")).sendKeys("password");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^Message display login success$")
	public void message_display_login_success() throws Throwable {
		System.out.println("Login Successfully");
	}
	
	@Given("^User is on account page$")
	public void user_is_on_account_page() throws Throwable {
		System.out.println("User is on account page now");
	}
	
	@When("^User click on product category$")
	public void user_click_on_product_category() throws Throwable {
		driver.get("http://store.demoqa.com/products-page/product-category/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^Message display on product category page$")
	public void message_display_on_product_category_page() throws Throwable {
		System.out.println("Now user on product category page");
	}
	
	
	@Given("^User is on product category page$")
	public void user_is_on_checkout_page() throws Throwable {
		System.out.println("User is on product category page");
	}
	
	@When("^User click on image of one product$")
	public void user_click_on_image_of_one_product() throws Throwable {
		driver.findElement(By.id("imagecol_32")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^Message display user can see the detail picture of the item$")
	public void message_display_user_can_see_the_detail_picture_of_the_item() throws Throwable{
		System.out.println("User can see detail picture of the product");
	}
	
}
