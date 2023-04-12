package org.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

@Before
    public void openURL(){

    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://magento-demo.lexiconn.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@After
public void closeBrowser() throws InterruptedException {
    Thread.sleep(1000);
    driver.quit();
}



}
