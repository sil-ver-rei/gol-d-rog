package org.example.tests;

import org.example.pages.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkIsLoginUnsuccessful() {
        loginModalView.clickLoginButton();

        Assert.assertTrue(loginModalView.assertThatModalViewIsDisplayed());

        loginModalView.enterCredentials("500156183", "password123");

        Assert.assertTrue(loginModalView.isErrorMessageDisplayed());

    }
}
