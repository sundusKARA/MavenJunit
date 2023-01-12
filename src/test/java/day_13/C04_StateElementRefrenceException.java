package day_13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_StateElementRefrenceException extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document

        driver.get("https://www.techproeducation.com");
        // lms linkine tikla ve o sayfanin url'ini lms icerdigini test et
        WebElement lmslogin = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(5);
        lmslogin.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("lms"));
        waitFor(5);

        // tekrar ana sayfaya gel lms logain sayfasina git
        driver.navigate().back();
       waitFor(5);
        lmslogin.click();

    }

    @Test
    public void test02() {
        //selenium.StaleElementReferenceException: stale element reference:

        //buldugumuz elemani sayfayi refresh yaptiktan sonra ayni elemani kullandim yine ayni hatayi aliyoruz

        driver.get("https://www.techproeducation.com");
        waitFor(5);
        WebElement lmslogin = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(5);
        driver.navigate().refresh();
        waitFor(5);
        lmslogin.click();
    }
}
