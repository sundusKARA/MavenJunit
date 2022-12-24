package day_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Resuable_Method {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");}


    //---------REUSABLE METHOD() :  Dropdown icin tekrar tekrar kullanabilecegimiz bir method olusturalim


        public void selectFromDropdown(WebElement dropdown , String secmekIstedigimizSecenek_Option){

        List<WebElement> options = dropdown.findElements(By.tagName("option"));   //bu elementteki tum "option" seceneklerini bana ver
            for(WebElement w: options){
                if(w.getText().equals(secmekIstedigimizSecenek_Option)){   //eger benim istedigim secenege esitse o zaman click yap
                    w.click();
                    break;
                }
            }


        }
        @Test
    public void selectFromDropdown() throws InterruptedException {
        Thread.sleep(3000);
        selectFromDropdown(driver.findElement(By.xpath("//select[@id='year']")),"2005");
        }


}
