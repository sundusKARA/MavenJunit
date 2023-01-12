package day_12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C02_ExplicitWait extends TestBase {
    @Test
    public void explicitWait() {
//        https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

//        Start buttonuna tıkla
        driver.findElement(By.xpath("//div[@id='start']//button")).click();

//        Hello World! Yazının sitede oldugunu test et
        /*
        WebElement helloWordElement = driver.findElement(By.xpath("//div[@id='finish']//h4"));
        Assert.assertEquals(" Hello World!",helloWordElement);

        burada neden wait olara implicitWait yeterli olmadigindan (cunku hello world yazisi ilk basta gizli (display-none)
         daha start butonuna tiklayinca geliyor. bu yuzden de bekleme suresi artiyor. o zaman da implicit ise yaramiyor)
       expilicitWait kullanmamiz gerekti. kullanmazsak test gecmez.
       ** nerden anladik expilicit problemi var **
       -- locat'imiz dogru , iframe yok , alert yok problem ne olabilir .bekleme var yani seknerozisyon problemi var
         */
        //*****  3 ADIMDA EXPLICIT WAIT UYGULAYABILIRIZ  ******

        //1. ADIM : obje olustur
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //2. ADIM  : Wait objwsini kullanarak bekleme problemini cozmeye calis
        WebElement helloWorldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4"))); // wait.until(ExpectedConditions. buraya kadar tunm expilit icin gecerlididr daha sonra secim yapiyoruz. fakat e4n kullanislisi bududr
        String helloWorldText = helloWorldElement.getText();
        Assert.assertEquals("Hello World!",helloWorldText);



    }
}
