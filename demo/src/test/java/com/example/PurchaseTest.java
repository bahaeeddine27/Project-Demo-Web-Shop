package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.example.pom.RegisterPagePom;
import com.example.pom.LoginPom;
import com.example.pom.CartPom;
import com.example.pom.PaymentPOM;

public class PurchaseTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private RegisterPagePom registerPage;
    private LoginPom loginPage;
    private CartPom cartPage;
    private PaymentPOM paymentPage;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        registerPage = new RegisterPagePom(driver);
        loginPage = new LoginPom(driver);
        cartPage = new CartPom(driver);
        paymentPage = new PaymentPOM(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void registerLoginPurchaseTest() {
        String email = "bahae" + UUID.randomUUID().toString().substring(0, 8) + "@test.com";
        String password = "Test@12345";

        assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());

        registerPage.clickRegisterLink();

        assertEquals( "https://demowebshop.tricentis.com/register", driver.getCurrentUrl() );

        registerPage.enterFirstName("Bahae");

        registerPage.enterLastName("Test");

        registerPage.enterEmail(email);

        registerPage.enterPassword(password);

        registerPage.enterConfirmPassword("Test@12345");

        registerPage.clickRegisterButton();

        assertEquals("https://demowebshop.tricentis.com/registerresult/1", driver.getCurrentUrl());

        registerPage.clickContinueButton();

        assertTrue(driver.getPageSource().contains("Log out"));

        registerPage.clickLogout();

        loginPage.clickLoginLink();

        loginPage.enterEmail(email);

        loginPage.enterPassword(password);

        loginPage.clickRememberMe();

        loginPage.clickLogin();

        cartPage.clickAddToCartButton();

        cartPage.enterRecipientName("Bahae Eddine");

        cartPage.enterRecipientEmail("Bahe@test.com");

        cartPage.clickAddToCartLink();

        cartPage.clickShoppingCart();

        cartPage.clickAgree();

        cartPage.clickCheckout();

        paymentPage.enterCompany("Company");

        paymentPage.enterCity("Paris");

        paymentPage.selectCountry();

        paymentPage.enterAddress("Rue Moussa");

        paymentPage.enterPostalCode("75000");

        paymentPage.enterPhoneNumber("0749654681");

        paymentPage.clickContinue();

        paymentPage.selectCreditCard();

        paymentPage.clickContinueToCard();

        paymentPage.enterCardName("Bahae Test");

        paymentPage.enterCardNumber("4242424242424242");

        paymentPage.enterCardCode("123");

        paymentPage.clickContinueToConfirm();

        paymentPage.confirmOrder();

        paymentPage.confirmOrderFinish();
    }
}
