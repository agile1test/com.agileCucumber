package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourseEnrollmentFormPage extends BasePage {
	private WebDriver driver;
	private By txtFNameBy = By.xpath("//input[@name='first_name']");
	private By txtLnameBy = By.xpath("//input[@name='last_name']");
	public CourseEnrollmentFormPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement txtFName() {
		return driver.findElement(txtFNameBy);
	}
	
	public void insertFName() {
		insertData(txtFName(), "aswde");
	}
	
	public WebElement txtLName() {
		return driver.findElement(txtLnameBy);
	}
	
	public void insertLName() {
		insertData(txtLName(), "sdas");
	}
	 
}
