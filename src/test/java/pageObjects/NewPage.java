package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPage  {
private WebDriver driver;
	private By newElement = By.xpath("//newXpath");
	public NewPage(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement newElement() {
		return driver.findElement(newElement);
	}
	
	public void clickNewElement() {
		newElement().click();
	}
	
}
