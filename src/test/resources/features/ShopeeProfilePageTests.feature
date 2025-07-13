@ShopeeSearchTestFeature

Feature: Shopee App Profile Menu Automation Skeleton Testing

  @Positive
  Scenario Outline: Verify Shopee App Search Function with Automation
    When User tried to open shopee homepage
    Then Verify promo is showing up
    Then Verify profile page is showing up
    Then User click on profile menu
    Then User should be shown up profile page menu
    And  Pesanan saya menu should be showing up
    And  Dompet saya section should be showing up

    Examples:
      | sample  |
      |         |