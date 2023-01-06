package day_10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions_1 extends TestBase {
    @Test
    public void rightClick() {

//    https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

//        1.Adım: Actions class’ta bir object oluşturulur.
        Actions actions = new Actions(driver);

//        2. Adım: Üzerinde çalışmak istediğiniz WebElement öğesini bulunur.
       WebElement kutu = driver.findElement(By.xpath("//*[@id='hot-spot']"));

//        3.Adim : perform() kullanarak bu webelement üzerinde action gerçekleştirilir.
//    Method: rightClick
        actions.contextClick(kutu).perform();    //kutucugun ustune gidip sag click yapacak //actions'la(creat ettigimiz obje) baslayip perform'la bitmek zorundadir

//    Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());  //driver'dan sonraki kisim actual yani var olan yaziyi aldik

//    Tamam diyerek alert’i kapatın
        driver.switchTo().alert().accept();


    }
}
