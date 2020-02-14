#Author: autor@greensqa.com
#Keywords Summary : login aws
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Go to the account settings on amazon aws

  @tag1
  Scenario: go to account settings on amazon aws
    Given into to the webside http://aws.amazon.com/en/
	  When into to the menu
    And into to the My account
    Then show me aws login

