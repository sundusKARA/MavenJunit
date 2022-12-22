package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Befor_Class_After_Class {
    /*
    @Beforclass ve @Afterclass notasyonlari sadece sadece static methodlar icin calisisr
    @Beforclass ve @Afterclass  kullanirsak olusturdugumuz @Test methodlarinin hepsini ayni anda calistirip en son @Afterclasii calistiri
    Ama sadece @befor ve @After kullanirsak her test icin @Befor ve @After'i kullanir
     */
    @BeforeClass
    public static void setUp(){
        System.out.println("Butun Testlerden once calisir");

    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Butun Testlerden sonra calissir");
    }
    @Before
    public void setUp01(){
        System.out.println("Her Testten once calisir");
    }
    @After
    public void tearDown01(){
        System.out.println("Her Testten sonra calisir");
    }

    @Test
    public void test01(){
        System.out.println("Ilk Test");
    }
    @Test
    public void test02(){
        System.out.println("Ikinci Test");
    }
    @Test
    @Ignore //Eger bir testi calistirmak istemezsek bu sekilde kullaniriz
    public void test03(){
        System.out.println("Ucuncu Test");
    }
}
