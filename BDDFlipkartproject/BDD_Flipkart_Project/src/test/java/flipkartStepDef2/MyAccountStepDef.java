package flipkartStepDef2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountStepDef {
	
	public WebDriver driver;

	@Given("User should be logged into the homepage1")
	public void user_should_be_logged_into_the_homepage1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@class='_2IX_2- VJZDxU']")).sendKeys("6282104008");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		
		System.out.println("homepage1");
		
	}

	@When("user clicks on myaccount1")
	public void user_clicks_on_myaccount1() throws InterruptedException {
		WebElement practise = driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Practise']"));
        Actions action = new Actions(driver);
        action.moveToElement(practise).perform();
        Thread.sleep(5000);
    //driver.findElement(By.xpath("//div[@id='container']//following::div[text()='My Profile']")).click();
		System.out.println("myaccount1 clicked");
		
	}

	@When("User then clicks on MyProfile Button")
	public void user_then_clicks_on_my_profile_button() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@id='container']//following::div[text()='My Profile']")).click();
		Thread.sleep(2000);
		System.out.println("click MyProfile");
		
	}

	@Then("My Profile page is displayed")
	public void my_profile_page_is_displayed() throws InterruptedException {
		System.out.println("MyProfile displayed");
		Thread.sleep(2000);
		driver.quit();
	    
	
	}
	


}
