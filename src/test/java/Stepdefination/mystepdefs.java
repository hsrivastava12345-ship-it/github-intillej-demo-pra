package Stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class mystepdefs {

    public static WebDriver driver;

    @Given("Go to the website {string}")
    public void goToTheWebsite(String arg0) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(arg0);

    }

    @Then("select country in input feild")
    public void selectCountryInInputFeild() {
        Select select = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        select.selectByContainsVisibleText("Australia");
    }
}
