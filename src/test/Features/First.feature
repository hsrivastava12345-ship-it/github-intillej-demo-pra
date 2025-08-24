
Feature: Selenium Fundamentals

  @Regression
  Scenario Outline: Successfully Testing the Blogspot Website
    Given Go to the website "<Website>"
    Then select country in input feild

    Examples:
      | Website                                      |
      | https://testautomationpractice.blogspot.com/ |
      | https://www.youtube.com                      |