#Author: Kaspar Moon kaspar@kasparmoon.us
#Story: KasparMoon Web Contact Form Validation
Feature: Validate KasparMoon Web Contact
  
  In order to verify contact
  as a user
  i want to visit kasparmoon web page and click on the contact button 
  and fill out the contact form then click on the send button

  Scenario Outline: validate contact form with valid data
    Given user should visit kasparmoon homepage
    And user should click on contact
    When user the type "<name>"
    And user should type "<email>"
    And user should type a "<subject>"
    And user type a "<message>"
    Then user should click send button

    Examples: 
      | name           | email             | subject                | message                 |
      | Caitlyn Saxton | ctember@gmail.com | Looking for Suggestion | I need your suggestion. |
