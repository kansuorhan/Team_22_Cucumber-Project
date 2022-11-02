Feature: Store manager olarak satis raporlarının incelenmesi testi

  Background: Ortak adimlar

    Given Belirtilen URL'e gidilir
    Given  Belirtilen URL'e gidilir
    Then ana sayfanin gorundugu dogrulanir
    And  sing in butonuna tiklanir
    And  email ve password girisi yapmak icin textboxlarin acildigi dogrulanir
    And  ilgili kisimlara gecerli email ve sifre girildikten sonra sign in butonuna tiklanir
    And  basariyla giris yapildigi dogrulanir
    And  sag ust taraftaki sing out secenegine tiklanir
    And  acilan sayfada store manager secenegine tiklanir
    And store manager penceresindeyken reports sekmesine tiklanir

  Scenario: TC_001 Yillik rakamlar gorulebilmeli
    Then Year sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir

  Scenario: TC_002 En son ay raporu gorulebilmeli
    Then Last Month sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir

  Scenario: TC_003 İcinde bulunan ayın raporu gorulebilmeli
    Then This Month sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir

  Scenario: TC_004 En son 7 gunun raporu gorulebilmeli
    Then Last Seven Days sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir

  Scenario: TC_005 Specific bir tarih araligi secilebilmeli
    Then Custom kutucugundan ozel bir tarih araligi secilebildigi dogrulanir

  Scenario: TC_006 Secilen spesific tarih aralginin raporu gorulebilmeli
    Then Custom kutucugundan ozel bir tarih araligi secilebildigi dogrulanir
    Then Secilen tarih araliginin raporunun goruntulendigi dogrulanir