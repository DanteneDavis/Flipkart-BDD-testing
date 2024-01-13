package flipkartStepDef1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLoginStepDef {

	public WebDriver driver;

	// For multiple login page cases

	@Given("User should be on Login page")
	public void user_should_be_on_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("Login page");
		Thread.sleep(2000);

	}
	

	@When("^User enters username as (.+) and (.+)$")
	public void user_enters_username_as_and_password_as(String uname, String pass) {
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(uname);
		driver.findElement(By.xpath(" //input[@class='_2IX_2- VJZDxU']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		System.out.println("username and password");


	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		System.out.println("LoginButton");


	}

	@Then("HomePage should be displayed for only valid login")
	public void home_page_should_be_displayed_for_only_valid_login() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

		System.out.println("homepage");

	}

}