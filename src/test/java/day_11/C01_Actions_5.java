package day_11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class C01_Actions_5 extends TestBase {
    @Test
    public void keyboardActionsTest() {
        //Google'la gidin https://www.google.com
        driver.get("https://www.google.com");

        //Creat a method keyboardActions
        //'iPhone X fiyatlari' yazdir (shift tusuna basilarak)
        //'cok pahali!' yazdir(shit tusuna basilmayarak)
        //Enter tusuna bas

       WebElement aramaKutusu = driver.findElement(By.name("q"));
       //aramaKutusu.sendKeys("iPhone X fiyatlari"+ Keys.ENTER); //bu kalip sadece bizim harfi harfine yazdigimizi yollar.
                                                                           //fakat burada farkli tuslara basmak isteniyorsa veya basmamak bizden o zaman mecburen action objesi olusturmaliyiz
        Actions actions = new Actions(driver);
        actions
                .keyDown(aramaKutusu, Keys.SHIFT)    //arama kutusunun ustunde shift tusuna basili tutuyoruz
                .sendKeys("iPhone X fiyatlari")     //shifte basiliyken yazi yaz  //burada basili tutuldugu icin arama kutusunda buyuk harf olarak yazacagiz
                .keyUp(aramaKutusu,Keys.SHIFT)      // artik shiftle isim bittigi icin shifte basma  //relese burada kullanmiyoruz cunku o click yaparken kullaniyor
                .sendKeys(" cok pahali!" + Keys.ENTER) //shifte birakmistik ve bu yaziyi yaz
                .build()                               //birden fazla actions method kullanildiginda build() kullanmaliyiz. cunku kodlar arasindaki baglantiyi guclendirir
                .perform();



        ///*********intervew********
        /*
        NOT:
        //   Actions classını kullanarak klavye ve mouse ile yapabileciğiz tüm işlemleri otomosyonda da  yapmamızı sağlamaktayız..!!
//   Bu classa ait metdodlar kısaca aşağıdaki gibidir....

//       actions.doubleClick () :   WebElement'e çift tıklama yapar
//       actions.clickAndHold () :  Uzerinde click yapili olarak bekler
//       actions .dragAndDrop () :  Bir noktadan diğerine sürükler ve bırakır
//       actions.moveToElement () : Mouse'u istedigimiz WebElement'in uzerinde tutar
//       actions.contextClick ():   Mouse ile istedigimiz WebElement'e sag tiklama yapar.
//       actions.sendKeys() :       Öğeye bir dizi anahtar gönderir
//       actions.keyDown () :       Klavyede tuşa basma işlemi gerçekleştirir
//       actions.keyUp () :         Klavyede tuşu serbest bırakma işlemi gerçekleştirir
//
//
//        !!!!Actions classını kullanmak için üç aşama vardır.

//     1.Action classından obje üretiriz.
//     (Actions actions= new Actions(driver);)
//     2.actions objesi ile kullanacağımız web elementi locate ederiz...
//     3.istediğimiz methodları action objesi ile kullanırız.
//     actions.doubleClick(element ismi).perform;

        1) Actions nedir?
        **Actions selenium'dan gelen bir kutuphanedir. Mouse ve Keyboard islemlerini gerceklestirmek icin
        kullandigimiz hazir bir selenium kutuphanesidir.
        Ornegin; saga tiklamak ( context Click), cift tiklamak(double click) , bir elemntin uzerine gitmek (move To Element) gibi islemler yapilabilir
        Ayni zamanda shift tusuna, control, delete, enter gibi keyboard tuslarina da actions yardimiyla basabiliriz.
        Bu tur islemlerde sendKeys methodu kullanilir.

        2) Ne tur methodlar kullanilir?
        Actions methodlari onwemlidir. Ve tekrar tekrar kullanmam gerektiginden, Actions methodlarini iceren Reusable
        methodlari olusturdum. Ve gerektiginden bu Reusable metodlari kullaniyorum.
        Ornegin; rightClick methodunu bir elemente saga tiklamak icin test classimda cagirabilirim

         */








    }
}
