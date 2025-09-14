package pageObjects;

import org.openqa.selenium.WebElement;

public class BasePage {
	public void insertData(WebElement e, String data) {
		e.clear();
		e.sendKeys(data);
	}
}
