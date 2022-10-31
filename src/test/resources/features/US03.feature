@muslera
  Feature: US03 Vendor olarak, order verebilmeliyim ve orderlarimi sepette görebilmeliyim


    Background: Ortak Adimlar

      Given Belirtilen URL'e gidilir.
      Then Sign in  tiklanir
      Then Username or email address box'a gecerli email gonderilir
      Then passwords box'a gecerli password gonderilir
      Then sign in submit buttonuna tiklanir


    @b1
      Scenario: TC_001 Orders bolumune gidilmeli
        Then Sign Out buttonuna tiklanir
        Then Orders'a tikladiktan sonra acilan sayfada Go Shopa tiklar
        And  Shop yazisini text olarak gorunurlugunu dogrular
        And  Sayfayi kapatir

        Scenario: TC_002 Sepete urun eklenebilmeli
          Then Sign Out buttonuna tiklanir
        Then Orders'a tikladiktan sonra acilan sayfada sepete rastgele 5 urun eklenir
         And  Sepete eklenen urun sayisi teyit edilir
          And  Sayfayi kapatir
         ##Scenario: TC_003 Checkout sayfasina gidilebilmeli

          # Then Ana sayfadaki Add Cart buttonuna tiklanir
          # Then Add cart butonunda acilan Pop Up ta View Cart butununa tiklanir
          # And  Checkout sayfasinda oldugumuz dogrulanir

          # Scenario: TC_004 Biling adrese gidilebilmeli
          #   Then Ana sayfadaki Add Cart buttonuna tiklanirr
          #   Then Add cart butonunda acilan Pop Up ta View Cart butonuna tiklanirr
          #   Then View cart butonuna basdiktan sonra acilan sayfada Checkout'a gidilir
          #   Then Billing Details bilgileri doldurulur
          #   Then Billing'e girilen bilgilerin goruldugu teyit edilir
          #   Then Ayni sayfadaki Place Order butonuna basilir
          #   And  Thank you. Your order has been received." yazisinin goruldugu teyit edilir










