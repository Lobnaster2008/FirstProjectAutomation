package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		
		// create object of the Select Class
		Select dropDownList = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		
		// select the Option By Index
		//dropDownList.selectByIndex(5);
		
		// select the Option by Value
		//dropDownList.selectByValue("3");
		// select the Option By Visible Text 
		dropDownList.selectByVisibleText("Green");
		
		
		
		driver.quit();
	}

}
