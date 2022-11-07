@US013
Feature: US13 Store Manager olarak coupon kodu verebilmeliyim

  @TC001
  Scenario: TC001 Store Manager olarak coupon kodu verebilmeliyim

    Given  Vendor "projeUrl" sayfasina gider
    And  Vendor olarak login yapar
    Then   Vendor My Account butonunun gorunur oldugunu test eder
    And   Vendor My Account butonuna tiklar
    Then   Vendor Store Manager butonunun gorunur oldugunu test eder
    And  Vendor Store Manager butonuna tiklar
    Then   Vendor Coupons butonunun gorunur oldugunu test eder
    And   Vendor Coupons butonuna tiklar
    Then  Vendor Add New butonunun gorunur oldugunu test eder
    And   Vendor Add New butonuna tiklar
    Then   Vendor Code blogunun gorunur oldugunu test eder
    And  Vendor Code bloguna kod yazar

  @TC002
  Scenario: TC002 Description yazabilmeliyim

    Then Vendor Description butonunun erisilebilir oldugunu test eder
    And Vendor Descpription kismini doldurur

  @TC003
  Scenario: TC003 Indirim sekli / discount belirleyebilmeliyim

    Then   Vendor DiscountType acilir menusunun gorunur oldugunu test eder
    And   Vendor acilir menuden secim yapar

  @TC004
  Scenario: TC004 Coupon amount belirleyebilmeliyim

    Then Vendor Coupon amount blogunun gorunur oldugunu test eder
    And Vendor Coupon amount degerini girebilmeli

    @TC005
  Scenario: TC005 Coupon expiry date / urun kuponu son kullanım tarihi girebilmeliyim

    Then Vendor CouponExpiryDate kismina tiklayinca date kutusunun gorunur oldugunu test eder
    And Vendor CouponExpiryDate bloguna tarih girebilmeli

      @TC006
  Scenario: TC006 Free shipping uygulayabilmeliyim

    And VendorAllow Free Shipping checkbox gorunur oldugunu test eder
    And Vendor Allow Free Shipping checkbox tiklar

        @TC007
  Scenario: TC007 Show on store secebilmeliyim

    Then Vendor Show on Store checkbox gorunur oldugunu test eder
    And Vendor Show on Store checkbox tiklar
    Then Vendor tum bilgilerin dolduruldugunu kontrol eder
    Then Vendor Submit butonunun gorunur oldugunu test eder
    And Vendor Submit butonuna tiklar
    Then Vendor Coupon Successfully Published. yazisinin cıktigini dogrular
    And Vendor Draft butonunun gorunur oldugunu dogrular
    And Vendor Draft butonuna tiklar
    And Vendor Coupon Successfully Saved. yazisinin gorunur oldugunu dogrular
    And Sayfayi kapatir









