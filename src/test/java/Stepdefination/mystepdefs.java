package Stepdefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class mystepdefs {

    @Given("Go to the website {string}")
    public void goToTheWebsite(String arg0) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(arg0);

    }
}
