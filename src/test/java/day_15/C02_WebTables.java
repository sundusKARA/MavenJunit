package day_15;

import day_18.C01_Log4J;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C02_WebTables extends TestBase {

    private static Logger logger = LogManager.getLogger(C01_Log4J.class.getName());
    @Test
    public void test01() {

//    https://the-internet.herokuapp.com/tables

        driver.get("https://the-internet.herokuapp.com/tables ");

//    Task 1 : Table1’i print edin
        String table1 = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println("TABLE 1 VERILERI"); //sout da ciktisi bu sekilde : TABLE 1 VERILERI
        logger.info("TABLE 1 VERILERI");   // sout ile ayni isi yapar arti olarak dosyaya yuklenir. ciktisi detayli olur :// 23:45:19.172 [main] INFO  day_18.C01_Log4J - TABLE 1 VERILERI
        System.out.println(table1);

       // her bir satiri bir butun olarak gurup gurup yazdirdi
        List<WebElement> tumVeriler = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement veri:tumVeriler) {
            System.out.println(veri.getText());
        }
        // lamda ile bu sekilde yazdiririz
        // tumVeriler.forEach(t-> System.out.println(t.getText()));
    }

    @Test
    public void test02() {
        //    Task 2 : 3. Row’ datalarını print edin
        driver.get("https://the-internet.herokuapp.com/tables ");
        List<WebElement> row3Element = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        row3Element.forEach(veri-> System.out.println(veri.getText()));
    }

    @Test
    public void test03() {
        //    Task 3 : Son row daki dataları print edin
        driver.get("https://the-internet.herokuapp.com/tables ");
        List<WebElement> sonSatir = driver.findElements(By.xpath("//*[@id='table1']//tbody//tr[last()]//td"));
        sonSatir.forEach(veri-> System.out.println(veri.getText()));
    }

    @Test
    public void test04() {
        //    Task 4 : 5. Column datalarini print edin
        driver.get("https://the-internet.herokuapp.com/tables ");
        List<WebElement> column5 = driver.findElements(By.xpath("//*[@id='table1']//tbody//tr//td[5]"));
        column5.forEach(veri-> System.out.println(veri.getText()));
    }
    public void printData (int satir , int sutun){
        driver.get("https://the-internet.herokuapp.com/tables ");
        String myXpath = "//table[@id='table1']//tbody//tr["+satir+"]//td["+sutun+"]";
        System.out.println(driver.findElement(By.xpath(myXpath)).getText());
    }

    @Test
    public void test05() {
//    Task 5 : Iki parametreli bir Java metot oluşturalım: printData
//    Parameter 1 = row numarasi
//    Parameter 2 = column numarasi
//    printData(2,3);  => 2nd row, 3rd column daki datayı print etsin

        printData(2,3);




    }


}