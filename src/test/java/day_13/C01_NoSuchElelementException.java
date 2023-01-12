package day_13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C01_NoSuchElelementException extends TestBase {
 /*
                   ----- Interview Questions------

    Tell me 5 exception that you get.-5 adet selenium da aldigin exceptions dan bahset.
    What type of exceptions do you get in selenium? - Seleniumda ki align exceptions tiplerinden bahset
    What is your solution?-Cozum ne?
    What type of waits do you use?- Hangi resit wait kullanirsin?
    Which wait do you prefer?- Hangi wait tercih edersin?
    Why do you prefer that wait?- Neden onu tercih edersin?
    How to you resolve synronization issue?-Senkronizasyon problemini nasil cozersin?

  NoSuchElementException  :
        Cozum: - ilk yapmamiz gereken sey locater'in dogrulugunu kontrol ederim
               - locat dogru ise manuel test yapariz ve o sirada html code'larini kontrol ederim (alert;iframe gibi elemntlerin varligini kontrol ederim)
               - wait problemi olabilir (implicit wait, bekleme suresini cozemiyor. bu dururmda expelicit wait ya da f;uent wait kullanilir)


  TimeOutException  :
          Cozum : - sadece explicit wait kullanildigi zaman ve explicit wait kullanilip elaman bulunamadiginda aliriz bu hatayi
                  - implicit wait kullandigimiz ve eleman bulunamadigi zaman ise no such element aliriz
                  - oncelikle sureyi arttiririz. farkli explicit wait cesitlerinden kullaniriz ( wait for visibility of element located , precence of element locator)
                  - locate'ri kontrol ederiz`
                  - java scpript executor'daki waitleri kullanabiliriz(wait for page to load : bu sayfanin gecislerindeki bekleme suresini handle edebilmek icin)
                  - FrameWork'umde reusable methodlar var bu durumda timeoutexception aldigimda hizlica o methodlar yardimiyla problemi cozebiliyorum

  NullPointerException  :  (olusturdugumuz varibla'nin ici bos ve java ona ne atayacagini bilmez ve null point ex. aliriz)
           Cozum : -



   StaleElementReferenceException : eski kullanilamaz durumda artik kullanima uygun degil
            cozum :- sayfayi yeniledigimiz zaman olabilir (o eleman ayni eleman olmaz)
                   - sayfada iler-geri gittigimiz zamanda da olabilir (o eleman ayni eleman olmaz)
                   - Elementi tekrar bulmak yenilemek
                   - selenium'un kurulurken boyle bir kural koymuslar bu yuzden var bu hata


    WebDriverException : - Cok yaygin olmamakla birlikte driver ve browser versiyonlari ayni veya yakin olmadiginda aliriz
                         - Driver(Browser)'i kapattiktan sonra tekrar kullanmak istedigimiz durumlarda alabiliriz
                 Cozum : -Framework dizaynini guzel olusturulmasi gerekir. orn. driver sinifinda birden fazla driver.quit() olmamali

 ElementNotInteractableException
 ElementClickInterceptedException
 InvalidArgumentException
 JavascriptException
 RemoteDriverServerException
 InvalidElementStateException
 InvalidSelectorException
            */

    @Test
    public void test01() {

      driver.get("https://www.techproeducation.com");
      driver.findElement(By.xpath("//input[@type='searchh']")).  // yanlis yazdigimiz locatten kaynikli hata : selenium.NoSuchElementException: no such element
              sendKeys("QA" + Keys.ENTER);


    }
}
