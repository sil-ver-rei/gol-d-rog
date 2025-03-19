package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LoginTest {
    private WebDriver driver;



    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://epicentrk.ua/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() throws InterruptedException {
        WebElement loginButtom = driver.findElement(By.xpath("//div[@class='header__login-opener']"));
        loginButtom.isDisplayed();
        loginButtom.click();

        WebElement usernameField = driver.findElement(By.xpath("//input[@name='login']"));
        usernameField.isDisplayed();
        usernameField.sendKeys("test123");

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.isDisplayed();
        passwordField.sendKeys("password123");

        WebElement entryButtom = driver.findElement(By.xpath("//button[@data-auth-type='login']"));
        entryButtom.isDisplayed();
        entryButtom.click();

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}