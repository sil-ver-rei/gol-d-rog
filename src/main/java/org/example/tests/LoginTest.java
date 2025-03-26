package org.example.tests;
import org.example.pages.BaseTest;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void checkIsLoginUnsuccessful() {
        loginPage.openLoginForm();
        loginPage.enterCredentials("500156183", "password123");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());

    }
}
