Feature: Adding employee in HRMS application

  Background:
    Given user is navigated to HRMS application
    When  user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in the application
    When user clicks on PIM option
    And user clicks on add employee button

  @test
  Scenario: Adding one employee
    When user enters firstname and lastname
    And user clicks on save button
    Then employee added successfully

    @sample
    Scenario: Adding one employee
      When user enters "adam" and "lovely" and "farwa"
      And user clicks on save button
      Then employee added successfully

      @outline
      Scenario Outline: adding multiple employees using scenario outline
        When user enters "<firstname>" and "<middleName>" and "<lastname>" in data driven format
        And user clicks on save button
        Then employee added successfully
        Examples:
          | firstname | middleName | lastname |
          | leny      |darzi       |fraud     |
          | pastor    |surma       |shalli    |
          | sana      |caty        |aim       |

