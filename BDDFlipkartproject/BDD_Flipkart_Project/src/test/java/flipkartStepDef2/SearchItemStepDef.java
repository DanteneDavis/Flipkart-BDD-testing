package flipkartStepDef2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchItemStepDef {
	
	public WebDriver driver;
	
	//for searching items 
	
		@Given("User should be logged into the homepage6")
		public void user_should_be_logged_into_the_homepage6() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath(" //input[@class='_2IX_2- VJZDxU']")).sendKeys("6282104008");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			Thread.sleep(2000);
			
			System.out.println("homepage6");
			
		    
		}
		@When("User clicks on Search option")
		public void user_clicks_on_search_option() throws InterruptedException {
			driver.findElement(By.xpath("//div[@id='container']//following::input[@name='q']")).click();
			Thread.sleep(2000);
			System.out.println("searchbar detected");
		    
		}
		@When("User enters items as their wish")
		public void user_enters_items_as_their_wish() {
			//driver.findElement(By.xpath("//div[@id='container']//following::input[@name='q']")).sendKeys("iphone 13 pro max" + Keys.ENTER);
			driver.findElement(By.xpath("//div[@id='container']//following::input[@name='q']")).sendKeys("iphone 13 pro max");
			System.out.println("item pasted for search");
		   
		}
		@When("User clicks on Search Button")
		public void user_clicks_on_search_button() throws InterruptedException {
			driver.findElement(By.xpath("//div[@id='container']//following::button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
		    System.out.println("search item is clicked");
		}
			
			
		
		@Then("The desired item page is displayed")
		public void the_desired_item_page_is_displayed() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		    
			System.out.println("desired output displayed");
		    
		}


}
