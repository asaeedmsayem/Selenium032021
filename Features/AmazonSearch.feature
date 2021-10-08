Feature: user want to visit amazon web page and verify serch
  
  In order to verify serch 
  as a register uger 
  i want to visit amazon web page and write a text in serch box then search
@Amazonsearch
  Scenario Outline: 
    Given user visit amazon home page
    And user search by "<productname>"
    Then user click on search button

    Examples: 
      | productname |
      | Tv          |