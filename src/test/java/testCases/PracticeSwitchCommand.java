package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		String url = "https://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		// switching the Frame by id
		driver.switchTo().frame("a077aa5e");
		System.out.println("***** we are switch to the frame *****");
		
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();
		
		System.out.println("***** we are Done ! *****");
		
		driver.close();
		
		

	}

}
