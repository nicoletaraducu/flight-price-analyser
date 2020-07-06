Feature: Find the cheapest flight ticket

    Scenario: I want to find the cheapest flight ticket for a certain period and a specific destination
        Given Open the Skyscanner website
        When Entering departure city "London"
        And Entering the destination city "Bucharest"
        And Setting departure date "December 2020" "20"
        And Setting return date "December 2020" "24"
        Then Return the "Cheapest first" offer

    Scenario: I want to find the fastest flight ticket for a certain period and a specific destination
        Given Open the Skyscanner website
        When Entering departure city "Geneva"
        And Entering the destination city "Madrid"
        And Setting departure date "September 2020" "6"
        And Setting return date "September 2020" "15"
        Then Return the "Fastest first" offer