package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

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
		WebElement btnRigthClick = driver.findElement(By.id("rightClickBtn"));
		
		action.contextClick(btnRigthClick).perform();
		
		String message = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals(message, "You have done a right click");
		
		driver.quit();
		
		
		
		

	}

}
