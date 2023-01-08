package day_11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_File_Download_Test extends TestBase {
    @Test
    public void fileDownloadTest() {

//        https://testcenter.techproeducation.com/index.php?page=file-download   adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

//        b10 all test cases dosyasını indirelim
        driver.findElement(By.partialLinkText("b10 all test cases")).click();
        waitFor(3);  //indirilirken biraz zamana ihtiyaci var.

//        Dosyanın başarıyla indirilip indirilmediğini test edelim
        String filePath = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";

      boolean indirildiMi =  Files.exists(Paths.get(filePath));
        Assert.assertTrue(indirildiMi);

    }
}
