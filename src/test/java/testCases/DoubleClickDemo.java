package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		// read CHROMEDRIVER.EXE
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		driver.get("https://demoqa.com/buttons");
		
		// instantiate class Actions
		Actions action = new Actions(driver);
		
		// retrieve  web element to perform Double Click
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(btnDoubleClick).perform();
		
		String message = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(message, "You have done a double click");
		
		driver.quit();
		
		

	}

}
