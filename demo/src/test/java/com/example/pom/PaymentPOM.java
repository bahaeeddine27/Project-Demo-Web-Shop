package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentPOM {
    private WebDriver driver;
    private By companyField = By.id("BillingNewAddress_Company");
    private By country = By.id("BillingNewAddress_CountryId");
    private By cityField = By.id("BillingNewAddress_City");
    private By addressField = By.id("BillingNewAddress_Address1");
    private By postalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    private By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    private By continueButton = By.cssSelector("input.new-address-next-step-button");
    private By creditCard = By.id("paymentmethod_2");
    private By continueToCard = By.cssSelector("input.payment-method-next-step-button");
    private By cardName = By.id("CardholderName");
    private By cardNumber = By.id("CardNumber");
    private By cardCode = By.id("CardCode");
    private By continueToConfirm = By.cssSelector("input.payment-info-next-step-button");
    private By confirm = By.cssSelector("input.confirm-order-next-step-button");
    private By confirmContinue = By.cssSelector(".button-2.order-completed-continue-button");

    public PaymentPOM(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCompany(String company) {
        driver.findElement(companyField).sendKeys(company);
    }

    public void enterCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void selectCountry() {
        Select select = new Select(driver.findElement(country));
        select.selectByValue("33");
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void selectCreditCard() {
        driver.findElement(creditCard).click();
    }

    public void clickContinueToCard() {
        driver.findElement(continueToCard).click();
    }

    public void enterCardName(String name) {
        driver.findElement(cardName).sendKeys(name);
    }

    public void enterCardNumber(String number) {
        driver.findElement(cardNumber).sendKeys(number);
    }

    public void enterCardCode(String code) {
        driver.findElement(cardCode).sendKeys(code);
    }

    public void clickContinueToConfirm() {
        driver.findElement(continueToConfirm).click();
    }

    public void confirmOrder() {
        driver.findElement(confirm).click();
    }

    public void confirmOrderFinish() {
        driver.findElement(confirmContinue).click();
    }
}