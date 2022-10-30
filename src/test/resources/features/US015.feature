Feature: US015 TC001 - 002 - 003

  Scenario: TC001
    Given Belirtilen "allowerURL" e gidilir
    Then  Sign In butonuna tiklanir
    Then  Kullanici "allowercommerceUserName" ve bilgileri girilir
    When  My Account a tiklanir
    When  Store Manager a tiklanir
    And   Coupons basligina tiklanir
    And   Istenen coupon tiklanir