
Feature: DemoWeb Shop Registration


  Scenario Outline: Multiple User Registration
    Given User is on demowebshop
    And Chooses to click on register
    When User enters the details "<gender>" and "<fname>" and "<lname>" and "<email>" and "<password>" and "<cpassword>" 
    And Clicks on register
    Then He sees his user homepage
   
Examples:
	|gender		|fname		|lname		|email										| password			| cpassword			|
	|male			|karthik	|kar			|karthik456789@gmail.com  |	karthik45678	| karthik45678	|
	|male			|anikhil	|khil			|anikhil789@gmail.com			| nikhil12378		| nikhil12378		|
	|female		|acath		|cath			|acath789@gmail.com				| cathy12378		| cathy12378		|