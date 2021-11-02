@tabledoc
Feature: DataTable And DocString
  DataTable And DocString Description

  Background: 
    Given 'Hello' background

  @datatable
  Scenario: DataTable Scenario
    Given Customer orders the dishes
      | dish            | quantity | description                                                           | area of origin | description              | area of origin | description              | area of origin |
      | Spicy Meatballs |        2 | meatballs in spicy sauce hot hot coffee  gnocchi in hot oil           | rome           | meatballs in spicy sauce | rome           | meatballs in spicy sauce | rome           |
      | Fried Gnocchi   |        2 | gnocchi in hot oil                                                    | milan          | gnocchi in hot oil       | milan          | gnocchi in hot oil       | milan          |
      | Espresso        |        3 | hot hot coffee hot hot coffee                                         | sicily         | hot hot coffee           | sicily         | hot hot coffee           | sicily         |
      | Spicy Meatballs |        2 | meatballs in spicy sauce                                              | rome           | meatballs in spicy sauce | rome           | meatballs in spicy sauce | rome           |
      | Fried Gnocchi   |        2 | gnocchi in hot oil                                                    | milan          | gnocchi in hot oil       | milan          | gnocchi in hot oil       | milan          |
      | Espresso        |        3 | hot hot coffee  gnocchi in hot oil hot hot coffee  gnocchi in hot oil | sicily         | hot hot coffee           | sicily         | hot hot coffee           | sicily         |
      | Spicy Meatballs |        2 | meatballs in spicy sauce                                              | rome           | meatballs in spicy sauce | rome           | meatballs in spicy sauce | rome           |
      | Fried Gnocchi   |        2 | gnocchi in hot oil                                                    | milan          | gnocchi in hot oil       | milan          | gnocchi in hot oil       | milan          |
      | Espresso        |        3 | hot hot coffee                                                        | sicily         | hot hot coffee           | sicily         | hot hot coffee           | sicily         |
      | Spicy Meatballs |        2 | meatballs in spicy sauce                                              | rome           | meatballs in spicy sauce | rome           | meatballs in spicy sauce | rome           |
      | Fried Gnocchi   |        2 | gnocchi in hot oil                                                    | milan          | gnocchi in hot oil       | milan          | gnocchi in hot oil       | milan          |
      | Espresso        |        3 | hot hot coffee  gnocchi in hot oil hot hot coffee  gnocchi in hot oil | sicily         | hot hot coffee           | sicily         | hot hot coffee           | sicily         |
      | Spicy Meatballs |        2 | meatballs in spicy sauce                                              | rome           | meatballs in spicy sauce | rome           | meatballs in spicy sauce | rome           |
      | Fried Gnocchi   |        2 | gnocchi in hot oil                                                    | milan          | gnocchi in hot oil       | milan          | gnocchi in hot oil       | milan          |
      | Espresso        |        3 | hot hot coffee                                                        | sicily         | hot hot coffee           | sicily         | hot hot coffee           | sicily         |

  @docstring
  Scenario: Doc String to Custom Object
    Given the doc string is
      """
      Hello there how r u?
      
      Doing great.
      Whats new?
      
      Nothing much.
      """
