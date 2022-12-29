package day_07;

import org.junit.Test;
import utilities.TestBase;

public class  C01_Test_Base_Demo extends TestBase {
    /*
    UTILITIES
    - Utilities tekrar tekrar kullanacagimiz classlari koydugumuz paketin adidir
    (zaruri ihtiyac gibi dusunebiliriz. mesela elektrigi kurariz bir ay kullanmasak da sonra yine kullanirriz. bunun gibi methodlar kullanili )
        *TestBase
        *Driver -> daha sonra gorecegiz
        * ExceUtil -> daha sonra gorecegiz
        * Configuration -> daha sonra gorecegiz
     - Utilities paketinde Test case'ler yazilmaz
     - Sadece tekrar kullanilabilecek support class (destek siniflari) olustururuz
     - Bu support classlar test caseslerin yazilmasini hizlendirir
     */
    @Test
    public void test1(){
        // techproeducation ana sayfasina git
        driver.get("");
        // title'in 'Bootcamps' kelimesini icerip icermedigini kontrol ediniz
    }



}
