@ShopeeHomepageTestFeature

  Feature: Shopee App Homepage Automation Skeleton Testing

    @Positive
    Scenario Outline: Verify Shopee App Homepage with Automation
      When User tried to open shopee homepage
      Then Verify promo is showing up
      Then Verify shopeepay menu is showing up
      Then User click on Shopeepay menu
      Then Verify user are redirected to login page

      Examples:
      | sample  |
      |         |