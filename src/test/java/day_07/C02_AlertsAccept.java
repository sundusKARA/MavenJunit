package day_07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C02_AlertsAccept extends TestBase {
    @Test
public void acceptAlertTest() throws InterruptedException {
    driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//        1. butona tıklayın,
    driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        uyarıdaki OK butonuna tıklayın
    Thread.sleep(5000);
    driver
            .switchTo()//degistir
            .alert()//alerte degistir
            .accept();//OK secenegine tiklanir
    Thread.sleep(5000);

//        ve result mesajının
//       “You successfully clicked an alert” oldugunu test edin.
    String actualResult = driver.findElement(By.xpath("//*[@id='result']")).getText();
    String excpentedResult = "You successfully clicked an alert";
        Assert.assertEquals(excpentedResult,actualResult);

}
/*
        * Alertleri nasil automate edersin ? how to handle alerts in selenium
        - Alertler javascriptle olusur. Insepect edilemezler. Oncelikle alerte switch etmemiz gerekir

 */


}
