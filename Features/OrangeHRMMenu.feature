# Story: Verify ORangeHRM Menu
# Story number - 14Sep21
# Author: Abu Saeed M Sayem AKA Kaspar Moon
# Author Email: kasparmoonva@gmail.com
# Author Website: www.kasparmoon.us
# Drafted on September 15, 2021
Feature: Verify ORangeHRM Platform Menu and Compare Packages

  @OrangeHRMMenu
  Scenario: Verify ORangeHRM Platform Menu and Compare Packages
    Given user visits OrangeHRM Homepage first
    When mouse hover on platform menu and click on Compare Packages
    Then user should see Compare Packages page
