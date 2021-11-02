@logs
Feature: Text and table logs

  @textlog
  Scenario: Text log
    Given Only text log

  @tablelog
  Scenario: Table log
    Given Only table log

  @bothlog
  Scenario: Both logs
    Given Both logs

  @megatablelog
  Scenario: Mega Content Table log
    Given Mega table log

  @spanslog
  Scenario: Span other than 1
    Given Wrong span table log
