package myflipkRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "./src/test/java/features",
		
		//features= "./src/test/java/features/loginTest.feature",
		// glue = "flipkartStepDef1", 
		
       // features="./src/test/java/features/account.feature",
       // features= "./src/test/java/features/search.feature",
        //features="./src/test/java/features/cart.feature",
       // features="./src/test/java/features/supercoin.feature",
		//features="./src/test/java/features/orders.feature",
		//features="./src/test/java/features/wishlist.feature",
		features="./src/test/java/features/menu.feature",
		//features="./src/test/java/features/logout.feature",
        glue ="flipkartStepDef2",
        
        //dryRun = true,
        

        plugin= {"pretty", 
        		"html:target/test-report","json:target/json-report","junit:target/junit-xml-report.xml"
        						
        }
        
        		  
        )

public class TestRunner1 {

}
