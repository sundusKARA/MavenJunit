package day_07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import javax.sound.midi.Track;

public class C04_PromptAlert extends TestBase {
    @Test
   public void sendKeysMethod() throws InterruptedException {

    driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

    //    3. butona tıklayın,
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);

    //    uyarıdaki metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("Sundus Kara");
        Thread.sleep(5000);

    //    OK butonuna tıklayın
        driver.switchTo().alert().accept();
        Thread.sleep(5000);


    //    ve result mesajında isminizin görüntülendiğini doğrulayın.
        String acturalResult = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String exceptedResult = "Sundus Kara";
        Assert.assertTrue(acturalResult.contains(exceptedResult));   // result kismindaki yazinin tamami sundus kara olmadigindan assertTrue vecontains methodunu kullandik


}
}
