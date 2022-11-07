package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@US014",
        dryRun = false

)

//dryrun=true mantığı ile step definitionları oluşturduğunuz için; daha önce o method varsa da oluştururur.
// Ama sarı olarak gösterilenlerin üzerine sağ tıklayıp oluşturursak method tekrarı olmaz...

public class TestRunnerZeliha {
    /*
     Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senartolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde

    features : Runeer dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder

    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.
     */
}

/*
Runner özellikle bir çok clas içinde istediğimiz methodları- test case'leri hazır şekilde çalıştırmaya imkan verir
 */

/*
Runner class: Cucumber ın olmazsa olmazlarındandır.
Runwith olmazsa olmazdır
CucumberOptions: Junitten geliyor, testlerimizi bu anatotion ile resources-feature da bulunan
Glue kısmı  ile birbirine yapıştırıyoruz, yani feauture fileım ile stepDefinition umu birbirine yapıştırıyorum
Daha sonra tag kısmında feature içinde olusturdugum isimlendirme  kısmını burada çağırıyorum.
dryRun(prova anlamında)= true ile calıstırdığımızda  eksik stepDefinitionları bulmak için kullanıyoruz, browser ı açmadan toolumuza getirir.
                       = false: varsayılan olarak false gelir. Browser calısır. Normal test case lerimizi koşacağımız zaman kullanıyoruz.
 */

//features : Runner dosyasinin feature dosyalarini nereden bulacagini gosterir
//glue : step definitions dosyalarini nerede bulacagini gosterir
//tags : hangi tag'i calistirmak istiyorsak onu yazarız
//dryRun=true yaptigimizda testimizi calistirmadan sadece eksik adimlari bize verir
//dryRun=false yaptigimizda testlerimizi calistirir
