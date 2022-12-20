package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPage extends ProjectSpecificMethods{
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
    @And("Enter the password as {string}")
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	@Then("Click the Login")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));
		reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}

}
