package day_07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_DismissAlert extends TestBase {
    @Test
    public void dismissAlertTest() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        // butona tıklayın,//*[@onclick='jsConfirm()']
        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);

        // uyarıdaki Cancel butonuna tıklayın ve
        driver.switchTo().alert().dismiss(); //Cancel secenegine tikliyoruz

        // result mesajının “You clicked: Cancel” oldugunu test edin.
        String actualResult =driver.findElement(By.xpath("//*[@id='result']")).getText(); //sitede var olan yazi
        String excpectedResult = "You clicked: Cancel";                                                //istenilen yazi
        Assert.assertEquals(excpectedResult,actualResult);







    }
}
