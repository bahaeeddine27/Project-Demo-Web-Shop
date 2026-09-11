package com.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPom {

    private WebDriver driver;

    private By loginLink = By.className("ico-login");
    private By emailInput = By.id("Email");
    private By passwordInput = By.id("Password");
    private By rememberMe = By.id("RememberMe");
    private By loginButton = By.cssSelector(".button-1.login-button");

    public LoginPom(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickRememberMe() {
        driver.findElement(rememberMe).click();
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}