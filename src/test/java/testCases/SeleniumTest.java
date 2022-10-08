package testCases;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void valid_UserCredential() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.clear();
		userName.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("admin123");
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@type = 'submit']"));
		btnSubmit.click();
	}
	
	@Test
	public void invalid_UserCredential() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.clear();
		userName.sendKeys("Lobna");
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("lobna123");
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@type = 'submit']"));
		btnSubmit.click();	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
