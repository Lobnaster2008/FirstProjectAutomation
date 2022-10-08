package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// read CHROMEDRIVER.EXE
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

				// open Chrome
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				// open demoqa
				driver.get("https://demoqa.com/alerts");
				
				driver.findElement(By.id("alertButton")).click();
						
				// accept Alert
				driver.switchTo().alert().accept();
				
				
				
				
				driver.quit();


	}

}
