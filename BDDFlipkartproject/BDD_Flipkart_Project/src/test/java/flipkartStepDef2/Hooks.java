package flipkartStepDef2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public WebDriver driver;

	
	
	@Before
	public void init() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		
//		driver.findElement(By.xpath(" //input[@class='_2IX_2- VJZDxU']")).sendKeys("6282104008");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		//driver.manage().window().maximize();
		System.out.println("Before method");
	
		
	}
	
	
	@After
	public void cleanup() {
		//driver.close();
		System.out.println("After method");
	}

}
