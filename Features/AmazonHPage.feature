Feature: Validate Amazon HomePage
@Amazonquit
  Scenario: Positive
    Given User Visit Amazon HomePage
    Then User should see Amazon HomePage
