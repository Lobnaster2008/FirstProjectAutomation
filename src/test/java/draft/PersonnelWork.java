package draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PersonnelWork {

	public static void main(String[] args) {
		// Part I
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); 
		
		// Sephora tunisie
		  driver.get("https://tutto-beauty.com.tn/");
		  
		  driver.findElement(By.className("klb-search")).click();
		  driver.findElement(By.id("s")).sendKeys("rouge");
		  driver.findElement(By.id("s")).submit();
		  driver.findElement(By.className("product_cat")).click();// check a checklist option
	
		  
		  //verify if the list is already checked
		
		
		// sephora France
		driver.get("https://www.sephora.fr/");
		//driver.manage().window().setSize(25*449); question : how to resize window
		driver.findElement(By.id("footer_tc_privacy_button_3")).click();
		System.out.println(" c bon tout est Accepter ,passer action suivante");
		driver.findElement(By.className("placeholder-wrapper")).click();
		//driver.findElement(By.className("autocomplete-0-input")).click();
		System.out.println("mettre curseur dans zone de recherche");
		driver.findElement(By.id("autocomplete-0-input")).sendKeys("parfum");
		driver.findElement(By.id("autocomplete-0-input")).submit();
		System.out.println(driver.getCurrentUrl().equals("https://www.sephora.fr/on/demandware.store/Sites-Sephora_FR-Site/fr_FR/Search-AlgoliaSearch?q=rouge"));
		driver.findElement(By.className("ais-SortBy-select")).click();
		Select list1 = new Select(driver.findElement(By.className("ais-SortBy-select")));
		list1.selectByValue("sorting-rule-price-desc");
		System.out.println(list1.getFirstSelectedOption());  
		driver.quit();

	}

}
