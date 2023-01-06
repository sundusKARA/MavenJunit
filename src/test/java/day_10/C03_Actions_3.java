package day_10;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class C03_Actions_3 extends TestBase {
    @Test
    public void scrolUpDown() {

        //https://techproeducation.com a git
        driver.get("https://techproeducation.com");

        //Sayfanin altına doğru gidelim
        Actions actions = new Actions(driver);
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();   //ne kadar asagi inecegimiziz tam olarak bilemiyoruz.
                                                    // o yuzden bir miktar indirecegiz. java escut'la ne kadar incegini verebiliriz ama bu sinirli

      //  actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP). //bu da kullanilir fakat bunlarin arasina bekleme suresi koyamayiz
      //    actions.sendKeys(Keys.ARROW_DOWN).perform(); // bu 2. yoldur fakat pagedown'dan daha az iner asagiya

        //Sonra sayfanın üstüne doğru gidelim

      waitFor(2);
      actions.sendKeys(Keys.PAGE_UP).perform();

        waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();

        waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
    }
}
