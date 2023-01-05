package day_08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C01_WindowsHandle1 extends TestBase {
    //Tests package'inda yeni bir class olusturun: WindowHandle
    //https://the-internet.herokuapp.com/windows adresine gidin.
    @Test
    public void handleWindowsTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");

        //------    ILK SAYFANIN ID'SINI ALALIM
        String windowsHandle = driver.getWindowHandle();

    //Sayfadaki textin "Opening a new window" olduğunu doğrulayın.
        String windows1Text = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",windows1Text);

    //Sayfa başlığının(title) "The Internet" olduğunu doğrulayın.
        String windowsTitle = driver.getTitle();
        Assert.assertEquals("The Internet",windowsTitle);

    //Click Here butonuna basın.
       driver.findElement(By.xpath("//*[@href='/windows/new']")).click();
       Thread.sleep(3000);

    //Acilan yeni pencerenin sayfa başlığının (title) "New Window" oldugunu dogrulayin.

        // String windows2Title = driver.getTitle();
        // System.out.println(windows2Title); eger bu iki kodu yazarsak ilk sayfanin title'ni verir. bu yuzden switch yapmaliyiz
        // bu noktda 2 pencere acik ve ben ikinci pencereye gecis yapmak istiyorum. bunu hapabilmek icin driver.getWindowsHandles (cogul olan) ile tum pencerelerin id'lerini alalim

        Set<String> allWindowHandles = driver.getWindowHandles();      // set return ettigi icin bu sekilde kullandik. tum windowslarin handl'larini aldik
        System.out.println(allWindowHandles);

        for(String w: allWindowHandles){
            //eger listedeki id windows1'e esit degilse otomatik olarak windows bir sonrakine esittir gecisi saglar
            if(!w.equals(windowsHandle)){
                driver.switchTo().window(w); // buradaki w windows2'nin id'sine esittir
                break; //bunu yapmazsak diger sayfaya gecer sonra yine gecer sonsuza kadar devam eder o yuzden break demeliyiz
            }
        }
        //Yukaridaki kodlari yazdiktan sonra bu noktada driver windows 2. pencerede

    //Sayfadaki textin "New Window" olduğunu doğrulayın.
        String windows2Title = driver.getTitle();
        Assert.assertEquals("New Window", windows2Title);

        String windows2Handle = driver.getWindowHandle();

    //Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu  doğrulayın.

        Thread.sleep(3000);
        //1.sayfaya gecis yaptim
        driver.switchTo().window(windowsHandle);
        Assert.assertEquals("The Internet",driver.getTitle());
        Thread.sleep(3000);
//        2. windowa tekrar gecelim
        driver.switchTo().window(windows2Handle);
        Thread.sleep(3000);
//        1. windowa tekrar gecelim
        driver.switchTo().window(windowsHandle);

    }
}
