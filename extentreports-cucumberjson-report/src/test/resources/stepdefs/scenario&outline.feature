@both
Feature: Scenario And Scenario Outline

  Background: 
    Given 'Hello' background
    
  Scenario Outline: Scenario_Outline-Row <row_num>
    Given Write a 'given' step with precondition in '<scenario_num><row_num>'
    When Complete action in 'when' step in '<scenario_num><row_num>'
    Then Validate the outcome in 'then' step in '<scenario_num><row_num>'

    Examples: Odd number prefix
      | scenario_num         | row_num |
      | Scenario Outline One |     300 |
      | Scenario Outline Two |     500 |

    Examples: Even number prefix
      | scenario_num         | row_num |
      | Scenario Outline One |     400 |
      | Scenario Outline Two |     600 |


  Scenario: Scenario Number Seven Seven Seven
    Given Write a 'given' step with precondition in 'Scenario 777'
    When Complete action in 'when' step in 'Scenario 777'
    Then Validate the outcome in 'then' step in 'Scenario 777'
