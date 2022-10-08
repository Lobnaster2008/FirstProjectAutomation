package draft;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class DemoFluentWait {

	public static void main(String[] args) {
		
		//
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
		
		WebElement subButton = (WebElement) fluentWait.until(new Function<WebDriver, WebElement>() {   
			public WebElement apply(WebDriver driver) {
				System.out.println(" yes");
				
				return driver.findElement(By.name("search_query"));
			}
			});
		subButton.sendKeys("fluent wait in selenium java");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button\"]")));
		WebElement likeButton = (WebElement) fluentWait.until(new Function<WebDriver, WebElement>() {   
			public WebElement apply(WebDriver driver) {
				System.out.println(" yes");
				
				return driver.findElement(By.xpath("//*[@id=\"button\"]"));
			}
			});
		likeButton.click();
		driver.quit();
		
		
		
		
		

	}

}
