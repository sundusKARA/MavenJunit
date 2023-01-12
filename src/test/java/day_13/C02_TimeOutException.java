package day_13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C02_TimeOutException extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.techproeducation.com");

    //   burada explicit icin olusturduguuz methodlardan birini cagiriyoruz

    //   waitForVisibility((By.xpath("//input[@type='searchh']")), 15).sendKeys("QA" + Keys.ENTER);
                                            //          parametre1: beklemek istedigim element   //parametre 2: max bekleme suresi

    //    selenium.TimeoutException: Expected condition failed: waiting for visibility of element located

    //    bu yazdigimiz kod da test base'i kullanmadan kendimiz burada da gormek icin yazdik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("YANLIS ID")));



    }
}
