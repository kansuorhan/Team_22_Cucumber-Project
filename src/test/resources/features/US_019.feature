Feature: Store manager olarak takipcileri gorme testi

  Background: Ortak adimlar
    Given  Belirtilen URL'e gidilir
    Then ana sayfanin gorundugu dogrulanir
    And  sing in butonuna tiklanir
    And  email ve password girisi yapmak icin textboxlarin acildigi dogrulanir
    And  ilgili kisimlara gecerli email ve sifre girildikten sonra sign in butonuna tiklanir
    And  basariyla giris yapildigi dogrulanir
    And  sag ust taraftaki sing out secenegine tiklanir
    And  acilan sayfada store manager secenegine tiklanir
    And  store manager penceresindeyken followers sekmesine tiklanir

    Scenario: TC_001 Isim, e-posta tanımlanmalı
      Then isimlerin ve epostalarin follower list basligi altinda tanimlandigi dogrulanir

      Scenario: TC_002 Islemleri tanımlanmalı
        Then islemlerin actions basligi altinda tanimlandigi dogrulanir