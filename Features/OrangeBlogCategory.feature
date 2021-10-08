# Story: Verify Blog Category Dropdown
# Story number - 13Sep21
# Author: Abu Saeed M Sayem AKA Kaspar Moon
# Author Email: kasparmoonva@gmail.com
# Author Website: www.kasparmoon.us
# Drafted on September 14, 2021
Feature: Verify Blog Category Dropdown
  
  In order to Verify Blog Category Dropdown Feature as a user
  I need to visit OrangeHRM Homepage then redirect to Blog Page.
  Now select Updates.

  @OrangeHRMBlog
  Scenario: Verify Blog Category Dropdown
    Given user go to OrangeHRM website
    When click on blog and user redirect to blog page
    And select updates from the category dropdown
    Then user will see updated blogs
