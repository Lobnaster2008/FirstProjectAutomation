package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyColor {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		
		// get color of the element
		String color = driver.findElement(By.xpath("// *[contains(text(), 'Java')]")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
		System.out.println(hexValue);
		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		System.out.println(hexValue1);
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		System.out.println(hexValue2);
		int hexValue3 = Integer.parseInt(hexValue[2]);
		System.out.println(hexValue3);
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		
		Assert.assertEquals("#337ab7", actualColor);
		System.out.println("The color of the element is: "+actualColor);
		
		// kill the session
		driver.quit();
		

	}

}
