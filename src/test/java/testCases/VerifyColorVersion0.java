package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyColorVersion0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open demoqa
		driver.get("https://demo.guru99.com/test/newtours/login.php");

		// get color of the element
		String color = driver.findElement(By.xpath("// *[contains(text(), 'Java')]")).getCssValue("color");
		color = color.substring("rgba(".length(), color.length() - 1);
		String[] colorTab = color.split(",");
		String hex = "";
		for (String colorI : colorTab) {
			System.out.println(colorI);
			// hex = hex+Integer.toHexString(Integer.valueOf(colorI.trim())); 
			// Another solution
			hex = hex + String.format("%02x", Integer.valueOf(colorI.trim()));
		}
		hex = "#" + hex.substring(0,hex.length()-2);// -2 pour ne pas retourner valeur conversion de transaprency
		System.out.println(hex);
		// kill the session
		driver.quit();

	}

}
