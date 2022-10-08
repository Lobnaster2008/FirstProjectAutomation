package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		// read CHROMEDRIVER.EXE
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open Mercury Application
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear();
		userName.sendKeys("Test");
		
		String attValue = userName.getAttribute("name");
		System.out.println("The name of the attribute is: "+ attValue);
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("Test");
		
		Dimension dimensions = userName.getSize();
		System.out.println("Height: "+dimensions.height + " Width:  "+ dimensions.width);
		
		Point point = password.getLocation();
		System.out.println("X coordinate: " + point.x + " Y coordinate: " + point.y);
		
		// verifier si le boutton afficher vrai ou faux
		WebElement btnSubmit = driver.findElement(By.name("submit"));
		boolean result1 =  btnSubmit.isDisplayed();
		System.out.println(result1);
		
		// verifier si le boutton activé
		boolean result2 = btnSubmit.isEnabled();
		System.out.println(result2);
		
		// verifier si le boutton existe
		List<WebElement> btnSubmit1 = driver.findElements(By.name("submit"));
		if(btnSubmit1.size() != 0) {
			System.out.println("Button is exist");			
		}else {
			System.out.println("Button is not exist");		
		}
		
		
	
	}

}
