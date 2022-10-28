@Background


Feature: US010 Shipping urun renk ve boyut secimi testi
  
  Background: Ortak adimlar
  Given Belirtilen URL'e gidilir
  Then Sing In butonuna tiklanir
  And E-mail ve password girisi yapmak icin textbox'larin acildigi dogrulanir
  And Acilan pencerede gecerli e-mail ve sifre girildikten sonra Sign In butonuna tiklanir
  And Basariyla giris yapildigi dogrulanir
  And Sayfanin en altinda bulunan My Account'a tiklanir
  And Acilan sayfada Store Manager secenegine tiklanir
  And Store Manager penceresindeyken Products sekmesine tiklanir
  And Sag ust kosede bulunan Add New butonuna tiklanir
  And Acilan sayfanin Add Product sayfasi oldugu dogrulanir
  And Acilan sayfada sol altta bulunan listede Shipping kismi tiklanir


    Scenario: TC01 Kullanici urune birden fazla renk secebilmeli

  Then Acilan pencerede urunun rengi secilebilmeli birden fazla

      Scenario: TC02 Kullanici urunun boyutunu secebilmeli

  And Acilan pencerede urunun boyutu secilebilmeli birden fazla