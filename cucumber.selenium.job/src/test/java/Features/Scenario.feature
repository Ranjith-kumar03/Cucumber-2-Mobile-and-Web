#Author: your.email@your.domain.com
@web
Feature: Logging in to a facebook website


  Scenario: Logging in to a facebook website
    Given open Chrome browser
    Then Enter user name
    Then Enter password
    Then clik on submit button
    Then Wait for some seconds
    Then quit the Browser
