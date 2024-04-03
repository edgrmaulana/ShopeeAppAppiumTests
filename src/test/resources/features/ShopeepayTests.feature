@ShopeepayTestFeature

  Feature: Shopeepay App Automation Skeleton Testing

    @Positive
    Scenario Outline: Verify Shopeepay App with Automation
      When User tried to open shopeepay homepage
      Then User tried to open riwayat page
      Then User click on the first transaction history
      Then Transaction history should contains transactions amount
      And  Transaction history should contains order number
      And  Transaction history should contains transaction number


      Examples:
      | sample  |
      |         |