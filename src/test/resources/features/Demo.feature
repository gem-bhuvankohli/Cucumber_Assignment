#@Demo1
Feature: Amazon Search Validation

#  Background: this is bk
#    Given User prints bk msg

  @test1
  Scenario: Amazon Search Validation
    Given user is on homepage
    Then user verifies amazon.in is visible
    When user enters "books" in search box
    Then user validates the search

