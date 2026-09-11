package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPagePom {

    private WebDriver driver;

    private By registerLink = By.className("ico-register");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By email = By.id("Email");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By continueButton = By.cssSelector(".button-1.register-continue-button");
    private By logoutLink = By.className("ico-logout");

    public RegisterPagePom(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegisterLink() {
        driver.findElement(registerLink).click();
    }

    public void enterFirstName(String firstname) {
        driver.findElement(firstName).sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void enterEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        driver.findElement(confirmPassword).sendKeys(confirmpassword);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
}