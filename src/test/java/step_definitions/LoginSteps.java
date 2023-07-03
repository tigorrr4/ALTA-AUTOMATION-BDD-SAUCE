package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Given("User already on website sauce demo")
    public void verifyLandingPage(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLandingPage());
    }

    @Then("User already on product page")
    public void verifyDashboard(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyDshboard());
    }
    @Then("User see {string} as error text on login page")
    public void verifyErrorText(String A) {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(A, loginPage.textError());
    }

}
