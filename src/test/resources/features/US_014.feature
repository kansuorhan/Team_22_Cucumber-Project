

@US014
  Feature: (US_013 defaming), Restrictions yapilabilmeli / ürüne kısıtlamalar getirilebilmeli

    Scenario: Minimum spend / en az alma miktari girilmeliyim

         And Vendor "projeUrl" sayfasina gider
         And Vendor olarak login yapar
         And Vendor My Account butonuna tiklar
         And Vendor Store Manager butonuna tiklar
         And Vendor Coupons butonuna tiklar
         And Vendor Add New butonuna tiklar
         And Vendor Add Coupon sayfasinda
         And Vendor US_013 deki TC adimlarini tamamlar
         Then Vendor Minimum Spend blogunun gorunur oldugunu test eder
         And Vendor Minimum Spend bloguna bir deger girer

    Scenario: Maximum spend / maksimum alma miktarı girebilmeliyim

         Then Vendor Maximum Spend blogunun gorunur oldugunu test eder
         And Vendor Maximum Spend bloguna bir deger girer


    Scenario: Individual use only / kisisel kullanım sadece secenegini tiklayabilmeliyim

         Then Vendor Individual use only checkbox kutusunun gorunur oldugunu test eder
         And Vendor  Individual use only checkbox kutusu tiklar

    Scenario: Exclude sale items / bazi satis ürünleri disinda tutabilmeliyim

        Then Vendor Exclude sale items checkbox kutusunun gorunur oldugunu test eder
        And Vendor  Exclude sale items checkbox kutusu tiklar

    Scenario: Exclude categories / bazi kategorileri disinda tut

         Then Vendor Exclude categories acilir menusunun gorunurlugunu test eder
         And Vendor Exclude categories acilir menuden secim yapar
         And Vendor tum bilgilerin dolduruldugunu kontrol eder
         And Vendor Submit butonunun gorunur oldugunu test eder
         And Vendor Submit butonuna tiklar
         And Vendor Coupon Successfully Published. yazisinin cıktigini dogrular
         And Vendor Draft butonunun gorunur oldugunu dogrular
         And Vendor Draft butonuna tiklar
         And Vendor Coupon Successfully Saved. yazisinin gorunur oldugunu dogrular
         And Sayfayi kapatir


