package day_09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C01_Window_Handle_2 extends TestBase {
    @Test
    public void test01() {
//        https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String window1Handle = driver.getWindowHandle(); //tekrar 1. pencereye donmek icin kullanacagiz. eger 2. penceremiz olmasaydi buna ihtiyacimiz olmazdi

//        Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String actualWindow1Text = driver.findElement(By.xpath("//*[.='Opening a new window']")).getText();
        String expectedWindow1Twxt = "Opening a new window";
        Assert.assertEquals(expectedWindow1Twxt,actualWindow1Text);

//        Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String actialWindow1Title = driver.getTitle();
        String expectedWindow1Title = "The Internet";
        Assert.assertEquals(expectedWindow1Title,actialWindow1Title);

//        Click Here butonuna basın.
        driver.findElement(new By.ByLinkText("Click Here")).click();
        waitFor(3);

//      ikinci pencere acilir ve ikinci pencerede islem yapmak istedigim zaman o pencereye swich (gecis) yapabiliriz
     switchToWindow(1);  //2. windowa gecis yaptik driver artik 2. window'da

//        Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        String actialWindow2Title = driver.getTitle();
        String expectedWindow2Title = "New Window";
        Assert.assertEquals(expectedWindow2Title,actialWindow2Title);
    }
}
