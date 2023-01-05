package day_09;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_Cookies extends TestBase {
    @Test
    public void handle_Cookies_Test() {
    //Class: Cookies
    //Method: handleCookies
    //Amazona git
        driver.get("https://www.amazon.com");
        waitFor(2);

    //1.toplam cookie sayisini bul
      Set<Cookie> allCookies = driver.manage().getCookies();
      int cookieSayisi = allCookies.size();
        System.out.println("Sayfada " + cookieSayisi+ " adet cookie sayisi var" );

    //3. Bir Cookie'yi ismiyle bul
        System.out.println("Coookie'yi Ismiyle Cagirdik : " + driver.manage().getCookieNamed("sp-cdn"));  //

    //tum cookileri yazdiralim
  //  allCookies.stream().forEach(t-> System.out.println(t.getName()));  // lamda ile yazilimi
        for(Cookie w: allCookies){
            System.out.println("Cookie :" + w );
            System.out.println("Cookie isimleri :" + w.getName());
        }

    //4. Yeni bir cookie ekle
        Cookie favoriCookiem = new Cookie("cikolatam","antep-fistikli-cikolata"); //yeni bir cookies olusturduk
        driver.manage().addCookie(favoriCookiem);
        System.out.println("Yeni Cookie Sayisi : "+ driver.manage().getCookies().size()); //yeni olusturdugunmuz eklendi mi eklenmedi  mi kontrol amacli yazdirdik

    //5. Bir Cookie'yi ismiyle sil
        driver.manage().deleteCookieNamed("cikolatam");

    //6. Tum cookie'leri sil
        driver.manage().deleteAllCookies();

        System.out.println("Tum Cookies'leri sildim. Yeni Cookie Sayisi : " + driver.manage().getCookies().size() );

        //not: bu yaptigimiz islemlerin hepsi gecicidri. eger sayfayi yeniden ac kapa veya refresh yaptigimiz zaman her sey geri yuklenir
    }
}
