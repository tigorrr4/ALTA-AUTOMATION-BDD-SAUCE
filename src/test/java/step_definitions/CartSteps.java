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
    public void UserAlreadyLogin(){
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

    @And("User Click add Labonesie too cart button")
    public void clickAddLabsOnesie(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickAddLabsOnesie();
    }

    @And("User Click add RedTshirt too cart button")
    public void clickAddRedTshirtTooCartButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickAddTshirtRed();
    }

    @And("User click cart button")
    public void clickShoppingCart(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickShoppingCart();
    }

    @When("User Click Remove RedTshirt on cart button")
    public void clickRemoveRedTshirtOnCartButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.removeButton();
    }


    @And("User Click checkout button")
    public void ClickCheckOutButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCheckoutButton();
    }


    @When("User input {string} as firstname and input {string} as lastname and input {string} as zipCode")
    public void fillDataCheckOut(String fristNam, String lastNam, String zipCode) throws InterruptedException {
    CartPage cartPage = new CartPage(webDriver);
    CartPage.setfirstName(fristNam);
    CartPage.setLastName(lastNam);
    CartPage.setZipCode(zipCode);
}

    @And("User Click Continue button")
    public void clickContinueButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickContinueButton();
    }


    @And("User see items on checkout overview page")
    public void verifyItemsToCheckout(){
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyItemsOnCart());
    }
    @And("User click finish button")
    public void ClickFinishButton(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickFinishButton();
    }



    @Then("User Confirmation order item on chekcout compelete page")
    public void verifyCompleteOrder(){
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyItemsOrder());
    }

}
