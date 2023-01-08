package day_12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_File_Upload extends TestBase {
    @Test
    public void fileUploadTest() {

    //    https://the-internet.herokuapp.com/upload adresine gidelim
    driver.get("https://the-internet.herokuapp.com/upload");

    //    chooseFile butonuna basalim
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));

    //    Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home")+"/Desktop/logo.svg";
        chooseFileButton.sendKeys(dosyaYolu);
        waitFor(3);
    //    Upload butonuna basalim.
    //"File Uploaded!" textinin goruntulendigini test edelim.
}
}