package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		driver.get("https://demoqa.com/tool-tips/");

		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTipText = text.getText();
		if (toolTipText.equals("Hover me to see")) {
			System.out.println("Pass : ToolTip matching excpected value");

		} else {
			System.out.println("Fail : ToolTip not matching excpected value");
		}
		
		driver.quit();

	}

}
