package day_18;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import utilities.TestBase;

public class C01_Log4J  {
    private static Logger logger = LogManager.getLogger(C01_Log4J.class.getName());
    @Test
    public void test01() {

        // --- Adimlar :

    //1. Dependecy'leri pomxml yukle
    //2. Class olustur
    //3. Logger object olustur
    //4. Logger fonksiyonuyla istenilen fonksiyonu kullan

        //  dependcy > class olustur > obje olustur > Logger fonksiyonlarindan istenilen fonksiyonu kullan

        //    private static Logger logger = LogManager.getLogger(Demo1.class.getName());
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