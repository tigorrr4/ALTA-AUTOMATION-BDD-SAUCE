package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectFilter;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addLabsOnesie;
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement addTshirtRed;

    @FindBy (xpath = "//a[.='2']")
    private WebElement cartButton;

    @FindBy (xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeButton;
    @FindBy (xpath = "//input[@id='continue']")
    private WebElement continueButton;
    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement checkOutButton;
    @FindBy (xpath = "//input[@id='first-name']")
    private static WebElement firstName;
    @FindBy (xpath = "//input[@id='last-name']")
    private  static WebElement lastName;
    @FindBy (xpath = "//input[@id='postal-code']")
    private  static WebElement zipCode;


    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private static WebElement verifyItem;
    @FindBy(xpath = "//button[@id='finish']")
    private static WebElement finishButton;
    @FindBy(xpath = "//span[@class='title']")
    private static WebElement thankyourOrder;

    public void clickFinishButton(){
        finishButton.click();
    }
    public boolean verifyItemsOnCart(){
        return verifyItem.isDisplayed();
    }
    public boolean verifyItemsOrder(){
        return thankyourOrder.isDisplayed();
    }
    public void selectProductFilter(String sort){
        Select a = new Select(selectFilter);
        a.selectByVisibleText(sort);
    }
    public void clickAddLabsOnesie(){
        addLabsOnesie.click();

    }
    public void clickAddTshirtRed(){
        addTshirtRed.click();
    }
    public void clickContinueButton() {
        continueButton.click();
    }
    public void clickCheckoutButton() {
        checkOutButton.click();
    }

    public boolean itemOnCart() {
       return cartButton.isDisplayed();

    }
    public void removeButton() {
        removeButton.click();
    }
    public void clickShoppingCart() {
        cartButton.click();
    }

    public  void setfirstName(String firstNam){
        firstName.sendKeys(firstNam);
    }
    public  void setLastName(String lastNam){
        lastName.sendKeys(lastNam);
   }
    public void setZipCode(String zipC){
        zipCode.sendKeys(zipC);
    }



}
