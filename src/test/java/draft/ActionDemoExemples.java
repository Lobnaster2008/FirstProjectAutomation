package draft;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoExemples {

		public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://nxtgenaiacademy.com/alertandpopup/");
			
			
			driver.findElement(By.name("promptalertbox1234")).click();
			// creating a PrompAlert 			
			Alert prompAlert = driver.switchTo().alert();
			prompAlert.sendKeys("Yes");
			prompAlert.accept();
			Assert.assertEquals("Thanks for Liking Automation", driver.findElement(By.id("demoone")).getText());
			
			
			// context menu managment 
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-4131\"]/a/span"))).perform();
				driver.findElement(By.xpath("//*[@id=\"menu-item-5296\"]/a/span")).click();
			
			Assert.assertEquals(driver.getCurrentUrl(), "https://nxtgenaiacademy.com/course-completion-certificate/");
			
			driver.quit();
			
			
		
		}

}
