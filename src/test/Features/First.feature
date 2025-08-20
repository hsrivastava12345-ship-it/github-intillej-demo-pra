
Feature: Selenium Fundamentals

  @Regression
  Scenario Outline: Successfully Testing the Blogspot Website
    Given Go to the website "<Website>"

    Examples:
      | Website                                      |
      | https://testautomationpractice.blogspot.com/ |
      | https://www.youtube.com                      |