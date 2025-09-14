package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
		
	private WebDriver driver;
	
	private By lnkEnrollNowBy= By.xpath("//a[@href='http://agile1test.com/pages/signUpForm.php']");
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	
	public WebElement lnkEnrollNow() {
		return driver.findElement(lnkEnrollNowBy);
	}
	
	public void clickEnrollNow() {
		 lnkEnrollNow().click();
	}
	
}
