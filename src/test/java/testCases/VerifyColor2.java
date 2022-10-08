package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		
		// identify text
		WebElement text = driver.findElement(By.xpath("// *[contains(text(), 'Java')]"));
		
		// obtain color in rgba
		String colorCss = text.getCssValue("color");
		
		// convert rgba to hex
		String color = Color.fromString(colorCss).asHex();
		
		System.out.println("Color is: " +colorCss);
		System.out.println("Hex code for color: " +color);
		
		// kill browser 
		driver.quit();

	}

}
