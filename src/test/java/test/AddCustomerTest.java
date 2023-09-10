package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	//TestData
	String username = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = "Dashboard";
	String addCustomerValidationText = "Add Contact";
	String fullname = "WORLDWIDE";
	String company = "Techfios";
	String email = "demo753@gmail.com";
	
	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		driver = BrowserFactory.init();
		LoginPage loginpage =  PageFactory.initElements(driver, LoginPage.class);
		loginpage.performLogin(username, password);
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage(dashboardValidationText);
		
		dashboardpage.clickCustomerElement();
		dashboardpage.clickAddCustomerElement();
		
		AddCustomerPage addCustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerpage.validateAddCustomerPage(addCustomerValidationText);
		
		addCustomerpage.insertFullname(fullname);
		addCustomerpage.selectCompanyName(company);
		addCustomerpage.insertEmail(email);
	}
	
	
	
}
