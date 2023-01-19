package day_17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;
import java.nio.file.WatchEvent;

public class C01_JSExecutor extends TestBase {
    @Test
    public void test01() throws IOException {

//scrollIntoViewTest metotu olustur
//Techpro education ana sayfasina git
        driver.get("https://www.techproeducation.com");
        waitFor(3);

//We Offer elementi gorunur olacak sekilde uzerine scroll et ve ekran gorunturunu al

        //1. Elementi bul
        WebElement weOffer = driver.findElement(By.xpath("//*[text()='we offer']"));
        //2. Java script objesi olustur
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //3. Yapmak istedigin islemi js.executeScript() methoduyla yap
        // scrollIntoView(true); metotu belirli bir elemente scroll yapmak icin kullanilir
        js.executeScript("arguments[0].scrollIntoView(true)",weOffer);  //tirnagin icindeki yerde hatali bir yazim yaptiysak exception atmaz ama calismaz. bu yuzden elle yazmayip gollayip kopyala yapistir
        waitFor(10);
        tumSayfaImg();

//Ayni sayfada Enroll Free elementi gorunur olacak sekilde scroll et ve ekran goruntusunu al
        scrollIntoViewJS(driver.findElement(By.partialLinkText("Enroll Free Course")));
        waitFor(3);
        tumSayfaImg();

//Ayni sayfada WHY US? elementi gorunur olacak sekilde scroll et ve ekran goruntusunu al
        scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
        waitFor(3);
        tumSayfaImg();

//Ayni sayfada tekrar Enroll Free elementi gorunur olacak sekilde scroll et ve ekran goruntusunu al
        scrollIntoViewJS(driver.findElement(By.xpath("//span[.='Enroll Free Course']")));
        waitFor(3);
         tumSayfaImg();

    }
}
