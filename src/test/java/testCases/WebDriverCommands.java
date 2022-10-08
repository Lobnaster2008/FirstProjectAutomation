package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open Orange 
		String url = "https://demo.guru99.com/test/newtours/login.php";
		driver.get(url);
		
		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();
		
		System.out.println("Title of the page is: "+titlePage);
		System.out.println("Length of the title page is: "+titleLength);
		
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(url)) {
			System.out.println("verification successfull - the correct url is opened ");
			
		}else {
			System.out.println("verification failed - an incorrect url is opened ");
		}
		
		System.out.println("actual url is: "+actualUrl);
		System.out.println("excpected url: " +url);
		
		String sourcePage = driver.getPageSource();
		int lengthSourcePage = sourcePage.length();
		System.out.println("Length of the source page: "+lengthSourcePage);
		
		driver.quit();
		

	}

}
