package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open 
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		
		// find webElements
		WebElement userName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAdresse = driver.findElement(By.id("currentAddress"));
		WebElement permanenttAdresse = driver.findElement(By.id("permanentAddress"));
		
		
		Actions action = new Actions(driver);
		action.sendKeys(userName, "Lobna").perform();
		action.sendKeys(email, "mhamdi.lobna@gmail.com").perform();
		action.sendKeys(currentAdresse, "Rue Monji Slim Thela 1261").perform();		
		
		// Copy current Adress
		action.keyDown(currentAdresse, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanenttAdresse, Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		// click on button Submit with javascriptExecutor
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.getElementById('userName').value = 'Adam';", userName);
		//executor.executeScript("arguments[0].value = 'text@gmail.com' );", email);
		System.out.println("******done***********");
		executor.executeScript("arguments[0].click();", btnSubmit);
		
		

	}

}
