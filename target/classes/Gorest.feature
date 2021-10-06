Feature: Gorest users

  @Test2
  Scenario: Get all users
    When all users are requested
    Then a status code 200 is returned
    And 20 users are returned



    Scenario: Create user
      When the following users created