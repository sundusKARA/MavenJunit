package day_04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Maven_ilk_tes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/ ");

//2arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

//3"Samsung headphones" ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones");
        aramaKutusu.submit();  //Enter'a basti submit'le ya da yukariya nokta Keys.ENTER da ayni isi goruyor

//4Bulunan sonuc sayisini yazdiralim
        WebElement aramaSonucu = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println("Arama Sonucu : " + aramaSonucu.getText());

//5Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();

//6Sayfadaki tum basliklari yazdiralim
        List<WebElement> sayfaBaslikIsim = driver.findElements(By.xpath("//h1"));
        for (WebElement w:sayfaBaslikIsim) {
            System.out.println(w.getText());}

        //lampda ile yazimi
        sayfaBaslikIsim.forEach(t-> System.out.println(t.getText())); //listle aldigimiz basliklari foreach ile de yazilir fakat lampda cok kisa

        //sayfayi kapatiniz
        driver.close();







    }
}
