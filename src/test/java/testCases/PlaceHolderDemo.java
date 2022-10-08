package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class PlaceHolderDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		driver.get("https://demoqa.com/tool-tips/");

		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		System.out.println("The placeholder is : " + textPlaceHolder);
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//scroll 
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500)", "");
		
		driver.quit();

	}

}
