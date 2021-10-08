# Story: Verify Facebook Login
# Story number - 070921
# Author: Abu Saeed M Sayem AKA Kaspar Moon
# Author Email: kaspar@kasparmoon.us
# Drafted on September 5, 2021
# Prerequisites
# a. The user should be knowing the credentials
Feature: Facebook Login Validation
  
  In order to verify Facebook
  as a registered user
  I need to visit Facebook Landing page and type username and password then click on the login button
@fbsignin
  Scenario Outline: validate facebook login with valid data
    Given user should visit facebook landing page
    When user type the "<username>"
    And user should type the "<password>"
    Then user should click login button
    And user should be able to login

    Examples: 
      | username             | password |
      | kaspar@kasparmoon.us | Km123456 |
