@Background

Feature: US015 TC001 - 002 - 003

  Background: : Entry
    Given Belirtilen "allowerURL" e gidilir
    Then  Sign In butonuna tiklanir
    Then  Kullanici "allowercommerceUserName" ve "allowercommercePassword" bilgileri girilir
    When  My Account a tiklanir
    When  Store Manager a tiklanir
    And   Coupons basligina tiklanir
    And   Istenen coupon tiklanir


  Scenario: TC001
    Given Limit sekmesine tiklanir
    Then Usage limit per coupon kutusuna "16" miktar yazilir
    When Submit butonuna basilir
    And Submit oldugu test edilir
    And Sayfa kapatilir


  Scenario: TC002
    Given Limit sekmesine tiklanir
    Then Limit usage to X items kutusuna "12" miktar yazilir
    When Submit butonuna basilir
    And Submit oldugu test edilir
    And Sayfa kapatilir

  Scenario: TC003
    Given Limit sekmesine tiklanir
    Then Usage limit per user kutusuna "11" miktar yazilir
    When Submit butonuna basilir
    And Submit oldugu test edilir
    And Sayfa kapatilir

