@navigate
Feature: Navigation Menu

  Scenario: Navigating Fleet -- Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet  Vehicles
    Then the title should be Vehicles
   @db
  Scenario: Navigating Marketing -- Campanigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketing,Campanigns
    Then the title should be Campanigns

  Scenario: Navigating Activities -- Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Activities  Calendar Events
    Then the title should be Calendar Events