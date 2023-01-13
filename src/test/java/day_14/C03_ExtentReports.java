package day_14;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import utilities.TestBase;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C03_ExtentReports extends TestBase {

    //Raporlama yaparken hatirlamamiz gereken 3 class var

    protected static ExtentReports extentReports;    //MAP GIBI CALISIR // WORDDE HAZLAYACAGIMIZ AYLAR SURECEK OLAN RAPORU BUDA HIZLICA YAPABILIRIZ
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @Test
    public void test01() {
        //      REPORT  PATH
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/reports/"+currentTime+"html_report.html";

        //        creating HTML report in the path
        extentHtmlReporter = new ExtentHtmlReporter(path);

        //        creating extent reports object for generating the Entire reports with configuration
        extentReports = new ExtentReports();

        ///********************RAPORU CUSTOMIZE EDEBILIRIZ **************

        // tarih eklememize gerek yok cunku onu otomatik atiyor
        // bunu bir kere yapiyoruz ama tabii ki degisiklik yapmak istersek de yapabilirriz. bu  bir sablon
        extentReports.setSystemInfo("Test Enviroment" , "Regression");
        extentReports.setSystemInfo("Application" , "TechPro Education");
        extentReports.setSystemInfo("Browser" , "Chrome");
        extentReports.setSystemInfo("Takim" , "Eagles");
        extentReports.setSystemInfo("Epic" , "Odeme Sayfasi");
        extentReports.setSystemInfo("Sprint Numarasi" , "Sprint-145");
        extentReports.setSystemInfo("QA" , "Sundus");

        //***************EXTRA RAPOR ISMI VE DOCUMAN ISMI EKLEYEBILIRIZ************

        extentHtmlReporter.config().setDocumentTitle("TechPro Education Reports");
        extentHtmlReporter.config().setReportName("Reression Test Sonucu");

        //************CONFIGURATION YANI RAPOR AYARLARI BITTI ******************

        //Raporu projeme eklemek icin
        extentReports.attachReporter(extentHtmlReporter);









    }
}
