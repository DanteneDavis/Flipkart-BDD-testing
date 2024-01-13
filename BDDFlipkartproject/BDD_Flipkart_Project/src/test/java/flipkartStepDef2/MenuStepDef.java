package flipkartStepDef2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuStepDef {
	
	public WebDriver driver;

	@Given("User should be logged into the homepage7")
	public void user_should_be_logged_into_the_homepage7() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@class='_2IX_2- VJZDxU']")).sendKeys("6282104008");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		System.out.println("homepage7");

	}

	@When("User clicks on Mobiles symbol Button")
	public void user_clicks_on_mobiles_symbol_button() throws InterruptedException {
		WebElement menu=	driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Mobiles']"));
		 Actions action = new Actions(driver);
         action.moveToElement(menu).perform();
         Thread.sleep(8000);

       menu.click();
       Thread.sleep(5000);
		System.out.println("Mobiles symbol clicked");

	}



	@When("User clicks on desired model here we are clicking Samsung model Button")
	public void user_clicks_on_desired_model_here_we_are_clicking_samsung_model_button() {
		 driver.findElement(By.xpath("//div[@id='container']//following::a[@class='_1AcS-S']")).click();
		System.out.println("Model selected");
	}


	@When("User selects desired model here we are selecting SAMSUNG Galaxy F12 model")
	public void user_selects_desired_model_here_we_are_selecting_samsung_galaxy_f12_model() throws InterruptedException {
		String parentWindow= driver.getWindowHandle();
        System.out.println("parant window id is: "+parentWindow);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='container']//following::div[text()='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
        Set<String> windows= driver.getWindowHandles(); //it will store the multiple windows id
        System.out.println("All windows");
        String childWindow=null;
        for(String a: windows)              
        { 
        	if(childWindow!=parentWindow)       //it checks the child id and parent id is not equals then finds the child window id.
        	{
        		childWindow=a;
        	}
        	System.out.println(a);
        }
        
        driver.switchTo().window(childWindow);
        //System.out.println(driver.getTitle());
		System.out.println("clicks on desired model");

	}
	
	@When("The new Child Window opens")
	public void the_new_child_window_opens() {
		System.out.println("the models window opens ");

	}

	@When("User clicks on add to cart Button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@id='container']//following::button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//		 WebElement prod=driver.findElement(By.xpath("//div[@id='container']//following::button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//	        JavascriptExecutor jse=(JavascriptExecutor)driver;
//	    	jse.executeScript("arguments[0].click()", prod);
		 Thread.sleep(5000);
		 driver.navigate().to("https://www.flipkart.com/viewcart?otracker=PP_GoToCart");
		 driver.navigate().back();
	    	Thread.sleep(6000);
		 System.out.println("add to cart");
	}
	
	@When("User clicks on Buy now Button")
	public void user_clicks_on_buy_now_button() throws InterruptedException {
		//driver.findElement(By.xpath("//div[@id='container']//following::button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
				WebElement ord=driver.findElement(By.xpath("//div[@id='container']//following::button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
				JavascriptExecutor jse=(JavascriptExecutor)driver;
		    	jse.executeScript("arguments[0].click()", ord);
		    	Thread.sleep(9000);
		    	
		    	 driver.navigate().to("https://www.flipkart.com/checkout/init?otracker=clp_metro_expandable_1_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_Q1PDG4YW86MF_wp2");
			        driver.navigate().back();
		    	Thread.sleep(8000);
	    
		
	}
	@Then("The the Buy now Product page is displayed")
	public void the_the_buy_now_product_page_is_displayed() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	    
		System.out.println("Here you can fill the details and place the order");
	    
	    
	}
}
	


