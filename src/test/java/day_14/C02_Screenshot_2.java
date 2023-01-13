package day_14;


import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02_Screenshot_2 extends TestBase {
    @Test
    public void test01() throws IOException {

        //  *** sayfada istedigimiz ozel bir alani screenshot alma islemi*****

//        Techpro education a git
                driver.get("https://www.techproeducation.com");
//        Sosyal medya elemanlarını goruntusunu al
//        1. ekran goruntusunu ek
                WebElement sosyalMedyaIconlari=driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[1]"));
                File image = sosyalMedyaIconlari.getScreenshotAs(OutputType.FILE);
//        2. goruntuyu kaydet
                String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        Path of screenshot save folder               folder / folder    /file name
                String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentTime+"image.png";
                FileUtils.copyFile(image,new File(path));

            }

    @Test
    public void test02() throws IOException {
        driver.get("https://www.techproeducation.com");
        takeScreenshotOfElement(driver.findElement(By.xpath(" //*[@title='Online IT Courses']")));

    }
}

