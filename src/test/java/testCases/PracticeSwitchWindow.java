package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeSwitchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/browser-windows";
		// open demoqa
		driver.get(url);
		// store and print th name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		// click on the button new window message
		WebElement btnNewWindow = driver.findElement(By.id("messageWindowButton"));
		btnNewWindow.click();
		
		//store and print the name of all windows
		Set <String> handles = driver.getWindowHandles();		
		//pass a window handle to other window
		for(String handle1 : handles) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);			
		}
		
		driver.quit();
		

	}

}
