package com.zerobank.stepdefinations;

import com.zerobank.pages.LoginPage;
import com.zerobank.utils.ConfigurationReader;
import com.zerobank.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Steps {

    LoginPage loginPage = new LoginPage();
    @Given("the user is on the Login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("User logins with the username {string} and password {string}")
    public void user_logins_with_the_username_and_password(String user, String password) {
        loginPage.login(user,password);
    }
    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {

    }

}
