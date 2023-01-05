package day_09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C02_Window_Handle_3 extends TestBase {
    @Test
    public void newWindowHandleTest() {
        //eger sirket selenium 4 kullaniyorsa bu testi kullanmaliyiz. bu yeni surum

//1. TechPro education sayfasinin title'inin "Techpro Education" metnini icerdigini test edin.
        driver.get("https://www.techproeducation.com");
        String techProHandle =driver.getWindowHandle();
        Assert.assertTrue(driver.getTitle().contains("Techpro Education"));

//2. Yeni bir pencerede Amazon sayfasini acip title'in "Amazon" metnini icerdigini test edin.
        waitFor(3);
        driver.switchTo().newWindow(WindowType.WINDOW);  //yeni bir window creat eder ve oraya gecis yapar// sadece window ise varolan sayfalarda gecis yapar yeni sayfa kuramaz
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

//3. Yeni bir pencerede LinkedIn sayfasini acip title'in "LinkedIn" metnini icerdigini test edin.
        waitFor(3);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.Linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));

        //Driver nerede? driver suanda linkedilnde
        //Techpro'ya gitmek icin tekrar driver.switchTo().window(); demeliyiz
        driver.switchTo().window(techProHandle);

        Assert.assertTrue(driver.getTitle().contains("Techpro Education"));
    }
}
