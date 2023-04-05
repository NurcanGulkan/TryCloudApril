package tryCLoud.step_definitions;

import io.cucumber.java.en.*;
import tryCLoud.pages.LoginPage;
import tryCLoud.utilities.ConfigurationReader;
import tryCLoud.utilities.Driver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("use on the login page")
    public void use_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String username, String password) {
        loginPage.username.sendKeys("User101");
        loginPage.password.sendKeys("Userpass123");
}


    @When("user click login button")
    public void user_click_login_button() {
       loginPage.loginButton.click();

    }
    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {

    }


}
