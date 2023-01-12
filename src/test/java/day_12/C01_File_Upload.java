package day_12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_File_Upload extends TestBase {
    @Test
    public void fileUploadTest() {
        /*
        NOT: selenium destok'i test edemez. browser'i test eder. ancak extra bir seyler yuklersek o zaman belki olabilir(otoIT gibi)
        fakat java ile path'ini alip gonderebilirim selenium'a
        - Dosya yukleme islemi icicn input ve type ""


         */

    //    https://the-internet.herokuapp.com/upload adresine gidelim
    driver.get("https://the-internet.herokuapp.com/upload");

    //    chooseFile butonuna basalim
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));

    //    Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home")+"\\Desktop\\logo.jpeg"; // eger path'te onedriver varsas bu sekilde yazmaliyiz : fileButton.sendKeys(System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\logo.jpeg");
        chooseFileButton.sendKeys(dosyaYolu);   // input var bu id'de yani chooseButton'da. Bu yuzden buraya bir bilgi aktarabilmek icin sendkeys methodunu kullanmaliyiz
        waitFor(3);

    //    Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();

    //"File Uploaded!" textinin goruntulendigini test edelim.
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!", actualText);


}
}