package draft;

import java.time.Duration;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindowExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demo.guru99.com/test/guru99home/";
		// open demoqa
		driver.get(url);
		driver.switchTo().frame("a077aa5e");			
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();
		//String parentWindow = driver.getWindowHandle();
		ArrayList<String> tabWindows = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabWindows.get(0)+"*****"+tabWindows.get(1));
		driver.switchTo().window(tabWindows.get(1));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement menu ; 
		menu =	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='View Search Form']")));
		menu.click();
		System.out.println("*************** click done****************");
		driver.quit();
		


	}

}
