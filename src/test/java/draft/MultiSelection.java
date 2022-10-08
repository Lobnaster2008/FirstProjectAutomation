package draft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MultiSelection {

	
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");

		// open Chrome
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/select-menu";
		driver.get(url);

		// Perform Multiple Select
		
		Actions actions = new Actions(driver);
		WebElement cars = driver.findElement(By.id("cars"));
	    List<WebElement> options = cars.findElements(By.xpath("//*[@id= 'cars']/option"));
		actions.scrollToElement(cars);
	   // actions.moveToElement(cars);
	   // org.openqa.selenium.interactions.Action 
	    Action multipleSelect = actions.keyDown(Keys.CONTROL)
				       .click(options.get(0))
				       .click(options.get(1))
				       .keyUp(Keys.CONTROL)
				       .build();
	    System.out.println("build is done");
	   
	    multipleSelect.perform();
	    
	    System.out.println("Multiselection is done !");
		  
		  //driver.close();
		 

	}

}
