package day_09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_BasicAuthentication extends TestBase {
    @Test
    public void basicAuthenticationTest() {
//        Bir class olusturun : BasicAuthentication

//        https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        driver.get("https://the-internet.herokuapp.com/basic_auth");

//        asagidaki yontem ve test datalarini kullanarak authentication’i yapin
//        URL              : https://username:password@URL
//        Username    : admin
//        password    : admin
//        Basarili sekilde sayfaya girin ve ‘Congratulations!’ yasizini doğrulayın

        //Authentication url'imiz : https://admin:admin@the-internet.herokuapp.com/basic_auth
        //                          https 'ten sonra adresi girmedim user ve psw url'e gomduk.
        driver.get(" https://admin:admin@the-internet.herokuapp.com/basic_auth");
        waitFor(3);
        String actialText = driver.findElement(By.xpath("//p")).getText();
        Assert.assertTrue(actialText.contains("Congratulations!"));

    }
}
