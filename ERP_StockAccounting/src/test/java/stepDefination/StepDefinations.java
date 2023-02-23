package stepDefination;
import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
		driver =FunctionLibrary.startBrowser();
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
		FunctionLibrary.openApplication(driver);
	}
	@When("^Wait For Username with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_For_Username_with_and_with_time(String LocatorType, String LocatorValue, String waittime) throws Throwable {
		FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Enter Username as \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Username_as_with_and(String TestData, String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.typeAction(driver, LocatorType, LocatorValue, TestData);
	}

	@When("^Enter Password as \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Password_as_with_and(String TestData, String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.typeAction(driver, LocatorType, LocatorValue, TestData);
	}

	@When("^Click On Login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Login_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@When("^Wait For Supplier with \"([^\"]*)\" and\"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_For_Supplier_with_and_with_time(String LocatorType, String LocatorValue,String waittime) throws Throwable {
		FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Click On Supplier with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Supplier_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@When("^Wait For AddButton with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_For_AddButton_with_and_with_time(String LocatorType, String LocatorValue,String waittime) throws Throwable {
		FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Click On AddButton with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_AddButton_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@When("^Wait For SupplierNumber with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_For_SupplierNumber_with_and_with_time(String LocatorType, String LocatorValue,String waittime) throws Throwable {
		FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@Then("^Capture Data with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void capture_Data_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.captureData(driver, LocatorType, LocatorValue);
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.typeAction(driver, LocatorType, LocatorValue, TestData);
	}

	@When("^Click On Add Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Add_Button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@When("^Click On Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Ok_Button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@When("^Click On Alert with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Alert_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@Then("^user validate the supplier table$")
	public void user_validate_the_supplier_table() throws Throwable {
		FunctionLibrary.supplierTable(driver, "6");
	}
	
	@Then("^Validate Page Title with \"([^\"]*)\"$")
	public void validate_Page_Title_with(String Exp_Title) throws Throwable {
	    FunctionLibrary.validateTitle(driver, Exp_Title);
	}

	@When("^Wait for Logout with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_for_Logout_with_and_with_time(String LocatorType, String LocatorValue, String waittime) throws Throwable {
	    FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Click on Logout with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_on_Logout_with_and(String LocatorType, String LocatorValue) throws Throwable {
	  FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@When("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		driver.close();
	}
	@When("^Wait For Stock Items with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_For_Stock_Items_with_and_with_time(String LocatorType, String LocatorValue, String waittime) throws Throwable {
	    FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Mouse drag to Stock Items with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void mouse_drag_to_Stock_Items_with_and(String LocatorType, String LocatorValue) throws Throwable {
	   
	}

	@When("^Mouse Click on Stock Categories with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void mouse_Click_on_Stock_Categories_with_and(String LocatorType, String LocatorValue) throws Throwable {
	    
	}

	@When("^Wait for Add \\+icon button with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_for_Add_icon_button_with_and_with_time(String LocatorType, String LocatorValue, String waittime) throws Throwable {
	    FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Click on Add \\+icon button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_on_Add_icon_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
	    FunctionLibrary.clickAction(driver, LocatorType, LocatorValue);
	}

	@When("^Wait for Category Name with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_for_Category_Name_with_and_with_time(String LocatorType, String LocatorValue, String waittime) throws Throwable {
	    FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Enter Category Name as \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Category_Name_as_with_and(String TestData,String LocatorType, String LocatorValue) throws Throwable {
	    FunctionLibrary.typeAction(driver, LocatorType, LocatorValue, TestData);
	}

	@When("^Wait For Ok Button with \"([^\"]*)\" and \"([^\"]*)\" with time \"([^\"]*)\"$")
	public void wait_For_Ok_Button_with_and_with_time(String LocatorType, String LocatorValue, String waittime) throws Throwable {
	    FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@When("^Wait For Alert with \"([^\"]*)\" and \"([^\"]*)\"with time \"([^\"]*)\"$")
	public void wait_For_Alert_with_and_with_time(String LocatorType, String LocatorValue, String waittime) throws Throwable {
	   FunctionLibrary.waitForElement(driver, LocatorType, LocatorValue, waittime);
	}

	@Then("^user validate the Stock Category table$")
	public void user_validate_the_Stock_Category_table() throws Throwable {
	    
		
	}




}
