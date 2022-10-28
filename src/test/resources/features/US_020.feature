Feature: Store manager olarak urunlerin incelenebilmesi testi

  Background: Ortak adimlar
    Given  Belirtilen URL'e gidilir
    Then ana sayfanin gorundugu dogrulanir
    And  sing in butonuna tiklanir
    And  email ve password girisi yapmak icin textboxlarin acildigi dogrulanir
    And  ilgili kisimlara gecerli email ve sifre girildikten sonra sign in butonuna tiklanir
    And  basariyla giris yapildigi dogrulanir
    And  sag ust taraftaki sing out secenegine tiklanir
    And  acilan sayfada store manager secenegine tiklanir
    And  store manager penceresindeyken reviews sekmesine tiklanir
    And  acilan ekranda product reviews butonuna tiklanir


  Scenario: TC_001 Kullanici bilgisi, yazmıs oldugu comment
    Then author ve comment sekmelerinin altinda kullanici bilgisinin ve yorum iceriginin goruntulendigi dogrulanir