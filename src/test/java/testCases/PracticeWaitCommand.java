package testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWaitCommand {

	public static void main(String[] args) {
		// read CHROMEDRIVER.EXE
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		driver.get("https://demoqa.com/alerts");
		
		WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", timerAlertButton);
		
		// wait for Alert to be present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Either PopUp is displayed or it's timed out");
		
		// accept the alert
		myAlert.accept();
		System.out.println("Alert Accepted");
		
		driver.quit();
		
		
	}

}
