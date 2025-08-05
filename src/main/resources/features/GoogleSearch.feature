Feature:

  Scenario: Search word
    Given Google page is opened
    When I search for Wikipedia
    Then I see search results for Wikipedia
