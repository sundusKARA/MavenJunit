package day_12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchCookieException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utilities.TestBase;

import java.time.Duration;

public class C03_FluentWait extends TestBase {
    @Test
    public void fluentWaitTest() {

//        https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1 ");

//        Start buttonuna tıkla
        driver.findElement(By.xpath("//div[@id='start']//button")).click();

//        Hello World! Yazının sitede oldugunu test et

        //1.adim : obje olustur
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))  //maximum sure koyulacaj
                .pollingEvery(Duration.ofSeconds(3)) //deneme araliklari
                .withMessage("IGNORE EXEPTION")     // mecburi degil optinal olarak kullanilabilir.
                .ignoring(NoSuchCookieException.class);  //eger exeptions yakalarsa yok demek icin. ignor et yani umursama, handle et
                                                        // bu wait cok fazla kullanilmamaktadir

        //2. adim : olusturdugumuz objeyi kullanarak bekleme problemini coz
       WebElement helloWorldElemenet =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
       String helloWorldText = helloWorldElemenet.getText();
       Assert.assertEquals("Hello World!",helloWorldText);

    }
}
