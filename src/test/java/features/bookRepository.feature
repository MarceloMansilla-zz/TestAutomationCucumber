Feature: Curso de automation

Scenario Outline: Log in to the system

Given I enter a term in search <search>
And I click on Search button
And I sort the list results by <order>
When I click on the first element
Then The desctiption screen should be displayed

Examples:
|search 							 | order 					| 
| Sailor moon tomo 7   | price_low_high |	