package testDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	/**
	 * Section for testing Login Action Feature
	 * @throws Throwable
	 */
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "/Users/xcpeng/Desktop/SQA3/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}
	
	@When("^User Navigate to LogIn Pages$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		driver.findElement(By.id("log")).sendKeys(username);
		driver.findElement(By.id("pwd")).sendKeys(password);
		// driver.findElement(By.id("login")).click();
		
	}
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}
	
	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}
	
	/**
	 * Section for test My Account Page functionality
	 */
	
	@Given("^User is LogIn$")
	public void user_is_logged_in(){
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_434");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
	}
	
	@Then("^User Click on My Account Button$")
	public void user_click_on_my_account_button(){
		driver.findElement(By.className("account_icon")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^Message displayed Navigate to My Account Successfully$")
	public void message_displayed_navigate_successfully(){
		if(driver.getCurrentUrl()=="http://store.demoqa.com/products-page/your-account/"){
			System.out.println("Navigate to My Account Successfully");
		}else{
			throw new PendingException();
		}
	}
	 
	@When("^User Click on Purchase History$")
	public void user_click_on_purchase_history(){
		driver.findElement(By.className("current")).click();
	}
	
	@Then("^Message displayed Navigate to Purchase History Page Successfully")
	public void user_is_able_to_purchase_history_page(){
		if(driver.getCurrentUrl()=="http://store.demoqa.com/products-page/your-account/?tab=purchase_history"){
			System.out.println("Navigate to Purchase History Page Successfully");
		}else{
			throw new PendingException();
		}
	}
	
	@When("^User click on Product Category and Accesories$")
	public void user_click_on_product_category(){
		driver.findElement(By.xpath("//a[contains(text(), 'Product Category')]")).click();
		driver.findElement(By.id("menu-item-34")).click();
	}
	
	@Then("^User Navigate to Accessories Page and show a message$")
	public void user_navigate_and_show_message(){
		if(driver.getCurrentUrl()=="http://store.demoqa.com/products-page/product-category/accessories/"){
			System.out.println("Go to Accessories Page");
		}else{
			throw new PendingException();
		}
	}
	
	/**
	 * Feature: User Shopping 1 item 
	 */
	
	@Given("^User Logged in and is on Home Page$")
	public void user_logged_in_and_home_page(){
		driver.findElement(By.xpath("//a[contains(text(), 'Home')]")).click();
	}
	
	@When("^User Click On BuyNow Button$")
	public void user_click_buynow_button(){
		driver.findElement(By.className("buynow")).click();
	}
	
	@Then("^Message displayed for Successfully go to product details page$")
	public void user_lead_to_product_details_page(){
		if(driver.getCurrentUrl().contains("product-category")){
			System.out.println("Successfully go to product details page");
		}else{
			throw new PendingException();
		}
	}
	
	@When("^User click Add to Cart$")
	public void user_click_add_to_cart(){
		driver.findElement(By.className("wpsc_buy_button")).click();
	}
	
	@Then("^Display Message Successfully Add item to Shopping Cart$")
	public void display_message_add_item_to_shopping_cart(){
		if(driver.findElement(By.id("fancy_notification"))!=null){
			System.out.println("Successfully Add item to Shopping Cart");
		}
	}
	
	@When("^User click on Go to Checkout$")
	public void user_click_on_go_to_checkout(){
		driver.findElement(By.className("go_to_checkout")).click();
	}
	
	@Then("^Display Message for Navigate to Checkout Page Successfully")
	public void display_message_for_checkoutpage(){
		if(driver.getCurrentUrl()=="http://store.demoqa.com/products-page/checkout/"){
			System.out.println("Navigate to Checkout Page Successfully");
		}else{
			throw new PendingException();
		}
	}	
}
