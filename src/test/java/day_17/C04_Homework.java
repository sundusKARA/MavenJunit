package day_17;

import org.junit.Test;
import utilities.TestBase;

public class C04_Homework extends TestBase {
    @Test
    public void test01() {

    //    	1)getValueTest metotu olustur

//	    2)https://www.priceline.com/ a git
    driver.get("https://www.priceline.com/");

//      3)Tarih kısmındaki Yazili metinleri al ve yazdır
        getValueBy("hotelDates");
}
    //---------------Interview Sorulari -----------------
    /*
    1) Javascript Executor nedir?
        Cevap :  Seleniumdan gelen ve javascprit kodarini calistirmaya yarayan bir interfacetir.
        Normal selenium methodlari yeterli olmadigi durumlarda kullanilabilir

    2) Ne zaman ve nasil kullanilir?
        Cevap : Normal selenium methodlari yeterli olmadigi durumlarda kullanilabilir. Ornegin bazi buttonlara tiklamada
        problem olabiliyor ya da belirli bir web elementin gorunur olacagin sekilde sayfanin laydirma islemi ya da input kutularindaki degerleri almak icin kullanilabilir.

    3) Sayfayi asagi veya yukari kaydirma islemi seleniumda nasil yapilir
        Cevap : Seleniumdaki Actions ya da javascript executor methodlari ile kaydirma islemleri yapilabilir.
        Ornegin actionslarda page_up, page_down, arrow_down metotlari ile ya da js executor'daki scrollintoview(true) ile yapilabilir.
        Ben olusturdugum reusable metotlarini kullanarak bu islemleri kolaylikla yapabiliyoruz

    4) Bir kutucuktaki yani inputtaki elemanin metni nasil alinabilir?
        Cevap : Js executor ile alabiliriz. Cunku js executor ile attributer degerlerini alma imkanimiz var
        getText() METODU BU DURUMLARDA CALISMAZ.

    5) Seleniumda click yaparken problem yasadigin oldu mu? (ya da soyle sorulabilir) Selenium outomasyonunda ne tur problemler yasadin?
        Cevap : Bazen yanlis locator ya da bekleme problemi gibi durumlarda problem yasadim.
        Bazen gizli (hidden) elemntlere click yaparken de problem yasadim. Bu durumlarda js executior kulandim ve problemi cozdum.
   ***  Cevap :(cok onemli bir soru) Teknik problemler : Yanlis locator , bekleme (wait) problemi , alert , iframe , pop-up seklindeki reklamlar
                                                         bildirimleri , multip;e window , hidden elemtlere tiklama , ...
                                     Takimla Ilgili Problemler : (Cok gundeme getirilmemeli) Developer bazen buldugum buglari kabul etmiyordu.
                                                                Cozum olarak da takimla beraber degerlendirip fikir birligine variyorduk




     */



}