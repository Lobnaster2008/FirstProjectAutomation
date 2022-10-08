package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		String url = "https://demo.guru99.com/test/upload/";
		driver.get(url);
		
		WebElement btnUpload = driver.findElement(By.id("uploadfile_0"));
		btnUpload.sendKeys("C:\\Users\\AHD JADID THELA\\Documents\\CV\\att.docx");
		WebElement btnAccept = driver.findElement(By.id("terms"));
		WebElement btnSubmit = driver.findElement(By.id("submitbutton"));
		btnAccept.click();
		btnSubmit.click();
		
		String message ="has been successfully uploaded.";
		Assert.assertEquals(message,driver.findElement(By.id("//*[@id = 'res']/center")));
		
		driver.quit();

	}

}
