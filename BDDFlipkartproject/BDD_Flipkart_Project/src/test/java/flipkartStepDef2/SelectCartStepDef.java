package flipkartStepDef2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCartStepDef {
	
	public WebDriver driver;

	@Given("User should be logged into the homepage5")
	public void user_should_be_logged_into_the_homepage5() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(" //input[@class='_2IX_2- VJZDxU']")).sendKeys("6282104008");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		System.out.println("homepage5");

	}

	@When("User clicks on cart symbol Button")
	public void user_clicks_on_cart_symbol_button() throws InterruptedException {
	    driver.findElement(By.xpath("//div[@id='container']//following::a[@class='_3SkBxJ']")).click();
	    Thread.sleep(1000);
		System.out.println("select cart");

	}

	@Then("The cart is displayed")
	public void the_cart_is_displayed() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	    
		System.out.println("cart page displayed");

	}

}
