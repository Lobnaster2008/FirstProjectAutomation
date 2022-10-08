package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		String url = "https://demoqa.com/droppable/";
		driver.get(url);
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).perform();

		// verify texte changed into Dropped!
		String textTarget = target.getText();
		if (textTarget.equals("Dropped!")) {
			System.out.println("Pass : source is drpped to target as excpected");

		} else {
			System.out.println("Failed : source could not be drapped to targed as excpected");
		}

		driver.quit();

	}

}
