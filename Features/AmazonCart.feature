# Story number - 080921
# Author: Abu Saeed M Sayem AKA Kaspar Moon
# Drafted on September 5, 2021
# Prerequisites
# 1. The user should be knowing the credentials
Feature: Validate Amazon Cart

  Scenario Outline: Validate Amazon Cart Successfully
    Given visit amazon homepage
    And click on the account
    When type your "<email>"
    And click on the continue
    And type the "<password>"
    And click on the sign-in button
    When successfully logged in
    And navigated to searchbox
    And type a "<productname>"
    And click on the search button
    When select product and click
    And click to select an option
    And click on the add to cart button
    And click on the no thanks button
    And click on the cart button
    Then validate amazon cart successfully

    Examples: 
      | email                  | password | productname                                     |
      | kasparmoonva@gmail.com | Km123456 | intel core i7 lenovo laptop with 17 inch screen |
