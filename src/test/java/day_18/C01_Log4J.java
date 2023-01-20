package day_18;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import utilities.TestBase;

public class C01_Log4J  {
    private static Logger logger = LogManager.getLogger(C01_Log4J.class.getName());
    @Test
    public void test01() {

//3. Logger object olustur:
//    private static Logger logger = LogManager.getLogger(Demo1.class.getName());

//4. Logger fonksiyonuyla istenilen fonksiyonu kullan
        logger.debug("Debug logger");  //codun neden kaldigini anlatan log
        logger.info("Info logger");
        logger.error("Error logger");
       logger.fatal("Fatal logger");  //olumcul hata
       logger.warn("Warn logger");

       /*
       Log4j Nedir?
           * Loglama yani yazdırma islemi yapmak icin kullanılan bir API dir
           * Cesitli seviyelerde loglama islemi yapılabilir: uyarı, bilgi, debug, hata mesajları icin kullanilabilir
           * Javadaki system.out.println e benzer, ama log4 j ile dosyaya detaylı sekilde yazdırma islemi yapabilir.
           * Su anda projemde log4J2 kullanmaktayım
        */
}
}