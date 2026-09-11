package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPom {

    private WebDriver driver;

    private By addToCartButton = By.cssSelector(".button-2.product-box-add-to-cart-button");

    private By recipientName = By.id("giftcard_2_RecipientName");

    private By recipientEmail = By.id("giftcard_2_RecipientEmail");

    private By name = By.id("giftcard_2_SenderName");

    private By email = By.id("giftcard_2_SenderEmail");

    private By addToCartLink = By.id("add-to-cart-button-2");

    private By shoppingCart = By.cssSelector("a[href='/cart']");

    private By agree = By.id("termsofservice");

    private By checkout = By.id("checkout");

    public CartPom(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void enterRecipientName(String recipientname) {
        driver.findElement(recipientName).sendKeys(recipientname);
    }

    public void enterRecipientEmail(String recipientemail) {
        driver.findElement(recipientEmail).sendKeys(recipientemail);
    }

    public void enterName(String name) {
        driver.findElement(this.name).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
    }

    public void clickAddToCartLink() {
        driver.findElement(addToCartLink).click();
    }

    public void clickShoppingCart() {
        driver.findElement(shoppingCart).click();
    }

    public void clickAgree() {
        driver.findElement(agree).click();
    }

    public void clickCheckout() {
        driver.findElement(checkout).click();
    }
}