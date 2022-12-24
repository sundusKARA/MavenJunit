package day_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01_Class_Work {
    WebDriver driver;
    //Eger test sinifinda birden fazla method olusturulmussa @Befor kullanilir. tek @Test varsa ikisi de olur.

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken dogum yilini,ayini ve gununu su sekilde secer : 2000 jonuary 10
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    @Test
    public void selectByIndexTest (){


        //Yil secimini yapacagiz
        //1.adim
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

        //2.adim : Select objesi olustur
        Select yearDropdown = new Select(year);

        //3.adim : Select objesini kullanarak 3 farkli sekilde secim  yapabilirim
        yearDropdown.selectByIndex(22);  //secenek sirasi 0'dan baslar

        //Ay secimini yapacagiz

        WebElement ay = driver.findElement(By.xpath("//*[@id='month']"));
        Select moth = new Select(ay);
        moth.selectByValue("0"); //value: locate ettigimiz sayfaya gidip value attribut'nu gidip bakacagiz oradaki degeri alip yazariz.

        //Gun secimini

        WebElement day =driver.findElement(By.xpath("//*[@id='day']"));
        Select dayDropdown = new Select(day);
        dayDropdown.selectByVisibleText("10");    //text yazisi ne ise onu kabul eder.en cok bu kullanilir. Case sensetive (buyuk kucuk harf duyarli)
    }

    @Test
    public void printAllTest() {


        // tum eyalet isimlerini konsola yazdir

        WebElement state = driver.findElement(By.xpath("//*[@id='state']"));

        Select stateDropdown = new Select(state);

        List<WebElement> stateList = stateDropdown.getOptions();   //tum secenekleri secip list<Webelement> secer. Webelemnt dondurur cunku dropdowndaki tum veriler Webelementtir.

        for (WebElement w : stateList) {
            System.out.println(w.getText());
        }
        //2.Yol lamda ile yazilisi
        stateList.stream().map(WebElement::getText).forEach(System.out::println);
    }
     @Test
     public void getSelectedOptionsTest(){

        //State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
         WebElement state = driver.findElement(By.xpath("//*[@id='state']"));
         Select stateDropdown =new Select(state);
         String varsayilanText = stateDropdown.getFirstSelectedOption().getText();
         Assert.assertEquals("Select a State",varsayilanText);
        }

        @After   //@Afterclass yaparsak tek bir methodu kapatir ama bu sayfada birden fazla oldugu icin @After kullanmak dogru olur
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        }

        //---Intervew Sorulari---

    /* dropdown:acilir menu
    1.What is dropdown?
    Dropdown bir liste olusturmak icin kullanilir

    2.How to handle dropdown element?
    Dropdown'u locate ederim
    Select class olustururum
    Select objesi olustururum
    Select objesi ile istedigim secenegi secerim

    Not: Select objesi olusturma nedenim , dropdownlarin select classi ile olusturulmasi

    3.Tum dropdown seceneklerini nasil print ederiz yani konsolda yazdiririz
    tum dropdown elementlerini getUptions() methodu ile listeye koyariz
    Sonra secenekleri loop ile yazdirabiliriz

    4.Bir secenegin secili oldugunu aoutomate etmek icin ne yapilir?
    ornk: Gun onlarak 10'u sectik ya secilmediyse bunu nasil handle ederiz
    getFirstSelectedOption() secili olan secenegi return eder

     */








}
