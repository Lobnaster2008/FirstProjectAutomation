package draft;

import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperCalculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		String url = "https://juliemr.github.io/protractor-demo/";
		driver.get(url);

		WebElement firstInteger = driver.findElement(By.xpath("//*[@ng-model = 'first']"));
		firstInteger.sendKeys("12");
		System.out.println("*******" + firstInteger.getAttribute("value") + "****");
		//int a = Integer.parseInt(firstInteger.getAttribute("value"));
		WebElement secondInteger = driver.findElement(By.xpath("//*[@ng-model = 'second']"));
		secondInteger.sendKeys("14");
		//int b = Integer.parseInt(secondInteger.getAttribute("value"));
		WebElement btnGo = driver.findElement(By.id("gobutton"));
		btnGo.click();
		WebElement resultat = driver.findElement(By.tagName("h2"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Pattern patter = Pattern.compile("\\+d");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), patter));
		System.out.println("Value is: " + resultat.getText());
		//System.out.println(a + " + " + b + " = " + (a + b));

		driver.quit();

	}

}
