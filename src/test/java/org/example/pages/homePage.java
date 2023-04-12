package org.example.pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class homePage {

    SoftAssert softAssert = new SoftAssert();
    By accountBtn = By.xpath("//a[@href=\"#header-account\"]");
    By RegisterBtn =By.xpath("//a[@href=\"http://magento-demo.lexiconn.com/customer/account/create/\"]");
    By firstNameTxt = By.id("firstname");
    By lastNameTxt = By.id("lastname");
    By email = By.id("email_address");
    By password = By.id("password");
    By confirmPass = By.id("confirmation");
    By confirmRegBtn = By.className("button");
    By welcomeMsg = By.className("welcome-msg");
    By logOutBtn = By.xpath("//a[@href=\"http://magento-demo.lexiconn.com/customer/account/logout/\"]");
    public void openRegisterpage(){
        Hooks.driver.findElement(accountBtn).click();
        Hooks.driver.findElement(RegisterBtn).click();
    }

    public void fillData(){
        Hooks.driver.findElement(firstNameTxt).sendKeys("Ahmed");
        Hooks.driver.findElement(lastNameTxt).sendKeys("Raouf");
        Hooks.driver.findElement(email).sendKeys("ahmedraouf.534@yahoo.com");
        Hooks.driver.findElement(password).sendKeys("RRR@1");
        Hooks.driver.findElement(confirmPass).sendKeys("RRR@1");
    }

    public void confirmation(){
        Hooks.driver.findElement(confirmRegBtn).click();
    }

    public void assertion(){
      String Msg =  Hooks.driver.findElement(welcomeMsg).getText();
        Hooks.driver.findElement(accountBtn).click();
     // String logout =  Hooks.driver.findElement(logOutBtn).getText();
        softAssert.assertTrue(Msg.contains("WELCOME"));
       // softAssert.assertTrue(logout.contains("Log Out"));
        softAssert.assertAll();
    }

}
