package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage{

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using  = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customer')]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADDCUSTOMER_MENU_ELEMENT;
	
	public void validateDashboardPage(String expectedText) {
		validateElement(DASHBOARD_HEADER_ELEMENT.getText(), expectedText, "Dashboard Page not Found!!");
	
	}
	
	public void clickCustomerElement() throws InterruptedException {
		Thread.sleep(2000);
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickAddCustomerElement() {
		ADDCUSTOMER_MENU_ELEMENT.click();
	}

	
}
