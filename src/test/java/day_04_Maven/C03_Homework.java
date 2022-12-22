package day_04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        2- https://www.google.com/ adresine gidin 3- cookies uyarisini kabul ederek kapatin
        driver.get("https://www.google.com/");


//        4Sayfa basliginin “Google” ifadesi icerdigini test edin
        WebElement googleYazisi = driver.findElement(By.xpath("//*[@alt='Google']"));

        if(googleYazisi.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

//        5Arama cubuguna “Nutella” yazip aratin
        WebElement nutella = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        nutella.sendKeys("Nutella", Keys.ENTER);

//        6Bulunan sonuc sayisini yazdirin
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[@id='result-stats']"));
        System.out.println("Sonuc Sayisi : " + sonucSayisi.getText());

//        7sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String onMilyon = sonucSayisi.getText().split(" ")[1];




//        8Sayfayi kapatin





    }
}
