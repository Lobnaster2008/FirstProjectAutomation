package testCases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import org.junit.Assert;



public class FirstTestCases {

	public static void main(String[] args) throws InterruptedException { 

		// read CHROMEDRIVER.EXE
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();

		// implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Mercury Application
		driver.get("https://demo.guru99.com/test/newtours/login.php");

		// fill USER NAME
		driver.findElement(By.name("userName")).sendKeys("test");

		// wait 3 seconds
		//Thread.sleep(3000); 


		// fill PASSWORD
		driver.findElement(By.name("password")).sendKeys("test");

		// click on SUBMIT button
		//driver.findElement(By.name("submit")).click();

		// click on Submit button with Explicit Wait
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * WebElement btnSubmit; btnSubmit =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
		 * btnSubmit.click();
		 */

		
		// click on Submit button with Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
		
		WebElement subButton = (WebElement) fluentWait.until(new Function<WebDriver, WebElement>() {   
			public WebElement apply(WebDriver driver) {
				System.out.println(" yes");
				
				return driver.findElement(By.name("submit"));
			}
			});
		subButton.click();
		           

		// verify HOME page  
		String welcomeMessage = driver.findElement(By.tagName("h3")).getText();
		Assert.assertEquals(welcomeMessage,"Login Successfully");




		// close BROWSER
		// driver.close();  // close the current window (last action)
		driver.quit();   // close the hole browser (kill browser )



	}

}
