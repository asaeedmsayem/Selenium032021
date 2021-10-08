# Story: Validate OrangeHRM Registration
# Story number - 12Sep21
# Author: Abu Saeed M Sayem AKA Kaspar Moon
# Author Email: kasparmoonva@gmail.com
# Author Website: www.kasparmoon.us
# Drafted on September 12, 2021
Feature: Validate OrangeHRM Subscription Feature
  
  In order to verify OrangeHRM Registration Feature as a new user
  I need to visit OrangeHRM Homepage then type email into the
  email input box right beside the Try OrangeHRM for Free button.
  After typing the email click on the Try OrangeHRM for Free button.
  User will redirect to the subscription form page.
  User needs to fill up the form and click on the capcha and
  click on the submit button right below the form.
  Now user should redirect to Registration Success Page.

  @OrangeHRMRegistration
  Scenario Outline: validate orangeHRM registration
    Given user visits OrangeHRM website
    And type "<email>" into the box
    And click on the try OrangeHRM for Free button
    When user will redirect to registration page and type a "<username>"
    And user should also type "<name>", "<email>", and "<phone>"
    And select country
    And click Populate the free trial with dummy data option
    And user should pass the captcha
    Then click on the submit button
    And redirect to the thank you page

    Examples: 
      | email            | username   | name        | phone      |
      | kaspar@gmail.com | shadowmoon | Shadow Moon | 7169862545 |
