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

public class LogoutStepdef {
	
	public WebDriver driver;
	
	@Given("User should be logged into the homepage8")
	public void user_should_be_logged_into_the_homepage8() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@class='_2IX_2- VJZDxU']")).sendKeys("6282104008");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		
		System.out.println("homepage8");
	}

	@When("user clicks on myaccount5")
	public void user_clicks_on_myaccount5() throws InterruptedException {
		WebElement practise = driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Practise']"));
        Actions action = new Actions(driver);
        action.moveToElement(practise).perform();
        Thread.sleep(5000);
    //driver.findElement(By.xpath("//div[@id='container']//following::div[text()='My Profile']")).click();
		System.out.println("myaccount5 clicked");

	}

	@When("User then clicks on Logout Button")
	public void user_then_clicks_on_logout_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Logout']")).click();
		Thread.sleep(5000);
		System.out.println("logout Button Clicked");

	}

	@Then("The page will be logged out")
	public void the_page_will_be_logged_out() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	    
		System.out.println("The application  will be logged out");

	}

}
