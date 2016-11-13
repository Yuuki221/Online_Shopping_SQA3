package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	/**
	 * Scenario for testing Login Action Feature
	 * @throws Throwable
	 */
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable{
		// replace the webdriver path here 
		System.setProperty("webdriver.chrome.driver", "/Users/xcpeng/Desktop/*/SQA3/Online_Shopping_SQA3/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		System.out.println("User is on home page now");
	}
	
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.id("account")).click();
	}
	
	@And("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("log")).sendKeys("testuser_434");
		driver.findElement(By.id("pwd")).sendKeys("password");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
	
	/**
	 *  Scenario: user reenter home page 
	 */
	@Given("^User is Logged In$")
	public void user_is_Logged_In() throws Throwable{
		System.out.println("Now user Logged In");
	}
	
	@When("^User Click Home Button$")
	public void user_Click_Home_Button() throws Throwable{
		driver.findElement(By.id("menu-item-15")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^Message display user now on home again")
	public void message_display_user_now_on_home_again() throws Throwable{
		System.out.println("User now home page again in Logged in status");
	}
	
	/*
	 * Scenario for Logout 
	 * 
	 * */
	@Given("^User is Logged In and on home page$")
	public void user_is_Logged_In_and_home_page() throws Throwable{
			System.out.println("Now user is on Loggin Page");
	}
	
	@When("^User click on Account button$")
	public void user_click_on_Account_button() throws Throwable{
		driver.findElement(By.id("account")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^Message displayed on account page$")
	public void message_displayed_on_account_page() throws Throwable{
		System.out.println("User is now on account page");
	}
	
	@When("^User Click Logout$")
	public void user_Click_Logout() throws Throwable{
		driver.findElement(By.id("account_logout")).click();
	}
	
	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable{
		System.out.println("Logout Successfully");
	}
	
	
}
