package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    private WebDriver driver;
//    private final OptionsWithArguments options;

//    public LoginTest(OptionsWithArguments options) {
//        this.options = options;
//    }

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://epicentrk.ua/");
    }

    @Test
    public void testLogin() throws InterruptedException {
        WebElement loginButtom = driver.findElement(By.xpath("//div[@class='header__login-opener']"));
        loginButtom.isDisplayed();
        loginButtom.click();

//        WebElement usernameField = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[2]/div/div[1]/div/form/div[2]/div/input"));
//       usernameField.sendKeys("test123");
//
//        WebElement passwordField = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[2]/div/div[1]/div/form/div[3]/div/input"));
//        passwordField.sendKeys("password123");
//
//        WebElement entryButtom = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[2]/div/div[1]/div/form/div[5]/button"));
//        entryButtom.click();

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}