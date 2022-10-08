package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

			// open Chrome
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			// open demoqa
			String url = "https://demoqa.com/menu/";
			driver.get(url);
			Actions action = new Actions(driver);
			WebElement slider = driver.findElement(By.id("sliderContainer"));
			action.moveToElement(slider, 45, 0);
			
	
			driver.quit();
			

	}

}
