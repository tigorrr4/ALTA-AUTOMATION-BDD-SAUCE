package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.PageObject.CartPage;
import org.example.PageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    private WebDriver webDriver;



    public CartSteps (){
        super();
        this.webDriver =Hooks.webDriver;

    }


    @Given("User already login")
    public void userAlreadyLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

    }

    @When("User sort product list by {string}")
    public void selectProductSort(String sort){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.selectProductFilter(sort);
    }

    @And("User click add Labs onesie too cart button")
    public void clickAddLabsOnesie(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickAddLabsOnesie();
    }

    @And("User click add RedT shirt too cart button")
    public void clickAddRedTshirtTooCartButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickAddTshirtRed();
    }

    @When("User click cart button")
    public void clickShoppingCart(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickShoppingCart();
    }

    @And("User click remove RedT shirt on cart button")
    public void clickRemoveRedTshirtOnCartButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.removeButton();
    }

    @And("User click checkout button")
    public void ClickCheckOutButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCheckoutButton();
    }


    @When("User input {string} as firstname and input {string} as lastname and input {string} as zipCode")
    public void fillDataCheckOut(String fristNam, String lastNam, String zipCode){
    CartPage cartPage = new CartPage(webDriver);
    cartPage.setfirstName(fristNam);
    cartPage.setLastName(lastNam);
    cartPage.setZipCode(zipCode);
}

    @And("User click continue button")
    public void clickContinueButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickContinueButton();
    }


    @Then("User see items on checkout overview page")
    public void verifyItemsToCheckout(){
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyItemsOnCart());
    }
    @And("User click finish button")
    public void ClickFinishButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickFinishButton();
    }



    @Then("User confirmation order item on checkout complete page")
    public void verifyCompleteOrder(){
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyItemsOrder());
    }



}
