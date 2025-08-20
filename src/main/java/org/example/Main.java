package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Harshit Srivastava");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("h.srivastava91191@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9136381284");
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("A-226D Gali no 7/A Mahavir Enclave Part 2");
        driver.findElement(By.xpath("//input[@id='male']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='female']")).isSelected());

        List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        for(int i = 0 ; i<days.size() ; i++){
            days.get(i).click();
        }

        Select select = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        select.selectByContainsVisibleText("Australia");

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        String date = "12";
        String month= "August";
        String year = "2025";

        boolean match = false;
        while(!match){
            String monthValue = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String yearValue = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if(!(monthValue.equals(month) && yearValue.equals(year))){
                driver.findElement(By.xpath("//span[text() = 'Next']")).click();
            }
            else {
                driver.findElement(By.xpath("//a[text() = "+date+"]")).click();
                match=true;
            }
        }

        month = "Aug";
        driver.findElement(By.xpath("//input[@id='txtDate']")).click();
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        selectMonth.selectByContainsVisibleText(month);
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        selectYear.selectByContainsVisibleText(year);
        driver.findElement(By.xpath("//a[text() = "+date+"]")).click();

        System.out.println("Hello Commit");

    }
}