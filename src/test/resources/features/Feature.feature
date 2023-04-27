Feature: The warrior had a damage 99
  Scenario: The warrior has 100 health and took 99 points of damage.
            Should check that health was decrease on 99 points.
    Given : The warrior have 100 health
    When : the warrior got 99 points damage
    Then : health warrior was decrease on 99 points health