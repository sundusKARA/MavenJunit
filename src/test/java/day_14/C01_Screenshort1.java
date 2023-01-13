package day_14;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01_Screenshort1 extends TestBase {
    /*
    Selenium'da tum ekran goruntusu nasil alinir
        - Tum ekran goruntusu selenium'dan gelen getScreenshotAs metodu ile alinir
        - getScreenshotAs metotu seleniumdaki TakesScreenshot api indan gelir
        - resimleri kaydettigimiz dosyaya nasil ulasiriz : resimleri kaydettigimiz intelijideki dosyanin ustune git - sag click- open in - explorer
     */
    @Test
    public void test01() throws IOException {
//        Class : screenShot1
//        Techpro education a git ve Sayfanin goruntusunu al
        driver.get("https://www.techproeducation.com");

        //1. Adim : Ekran goruntusunu getScreenshotAs methodu ile alip File olarak olusturalim
        File resim = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);     //dosya uzantisi file olacak

        //2. Adim : almis oldugum ekran goruntusunu bu path kaydecegim
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()); //bunu olusturduk cunku goruntuyu aldigimiz zamani saati saniyeyi gorebilmemiz ici9n javada olan bu tarih objesini olusturduk
        String path = System.getProperty("user.dir") + "\\test-output/EkranGoruntuleri\\"+currentDate+"image.png";
        File hedef = new File(path);   // bunu olusturduk cunku asagida parametrede string degil file kullanacagimiz icin

        //3. Adim : Goruntum ile dosyami birlestirip kaydet
        FileUtils.copyFile(resim , hedef);


//        ****Kisa yol (cok da kullanilmiyor)
//        FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),
//        new File( String path = System.getProperty("user.dir") + "\\test-output/EkranGoruntuleri\\image.png"));


//        -“QA” aramasi yap
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("QA" + Keys.ENTER);

//        Acilen sayfanin metnini test et ve ekran goruntusu al: “Search Results for: qa”
        String excented = "Search Results for: qa";
        String actual = driver.findElement(By.xpath("(//*[@class='elementor-heading-title elementor-size-default'])[1]")).getText();
        Assert.assertFalse(excented.contains(actual));

    }

    @Test
    public void test02() throws IOException {

        driver.get("https://www.amazon.com");

        tumSayfaImg();    //screenshot icin test base'te yeni methodu olusturup kullandik

    }
}
