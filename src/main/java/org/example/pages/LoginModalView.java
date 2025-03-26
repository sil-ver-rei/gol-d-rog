package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//div[@class='header__login-opener']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@data-auth-type='login']")
    public WebElement entryButton;

    @FindBy(xpath = "//div[@class = 'm0f3']")
    public WebElement errorMessage;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    public void clickLoginButton() {
        click(loginButton);
    }

    public void enterCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        click(entryButton);
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }
}