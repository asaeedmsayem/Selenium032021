# Story: Verify Dell Product Menu, Laptop Submenu, and Workstation Option
# Story number - 11Sep21
# Author: Abu Saeed M Sayem AKA Kaspar Moon
# Author Email: kasparmoonva@gmail.com
# Author Website: www.kasparmoon.us
# Drafted on September 8, 2021
Feature: Dell Product Menu, Laptop, and Workstation Validation
  
  In order to verify Product Menu, Laptop, and Workstation
  as a buyer I want to visit dell web page Product Menu

@dellproductmenu
  Scenario: 
    Given user visit Dell website
    When user mouse hover on product menu
    And user mouse hover on laptop and click on for home submenu
    And user go back to homepage
    And user hover mouse on the product menu
    Then user click on workstations
    And user should redirect to workstations page