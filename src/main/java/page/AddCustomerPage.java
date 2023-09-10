 package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage{
	
WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using  = "//h5[contains(text(), 'Add Contact')]") WebElement ADDCUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FULLNAME_ELEMENT;
	@FindBy(how=How.XPATH, using = "//select[@id='cid']") WebElement COMPANY_DROP_ELEMENT;
	@FindBy(how=How.XPATH, using = "//input[@id='email']") WebElement EMAIL_ELEMENT;
	
	
	public void validateAddCustomerPage(String expectedText) {
		validateElement(ADDCUSTOMER_HEADER_ELEMENT.getText(), expectedText, "Add Customer page not found");
	}
	
	public void insertFullname(String fullname) {
		FULLNAME_ELEMENT.sendKeys(fullname + randomNumGenerator(999));
	}
	
	public void selectCompanyName(String company) {
		selectFromDropDown(COMPANY_DROP_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(randomNumGenerator(99) + email);
	}
	
	
	
	
}
