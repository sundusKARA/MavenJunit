package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Class_Work {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
       // driver.close();
    }
    @Test
    public void test01() throws InterruptedException {
//        Verilen web sayfasına gidin.
//        https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

//        Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkb01 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkb02 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

//        Checkbox1 seçili değilse onay kutusunu tıklayın
        Thread.sleep(3000);
        if(!checkb01.isSelected()){ //isaretli degilse demek bu kod
            checkb01.click();
        }

//        Checkbox2 seçili değilse onay kutusunu tıklayın
        if(!checkb02.isSelected()){
            checkb02.click();
        }






    }
}
