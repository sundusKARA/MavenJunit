package day_11;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_File_Exist  {
    @Test
    public void isExistTest() {
//        Class : FileExistTest
//        Method : isExist
//        Masa ustunden bir dosyanın varligini test et

        String userDIR = System.getProperty("user.dir");  //dinamik path almak icin
        System.out.println(userDIR);

        String userHOME = System.getProperty("user.home");
        System.out.println(userHOME);  //root direct'i verir

        String dosyayolu = userHOME + "\\Desktop\\logo.jpeg";  //uzantisiyla birlikte yazmaliyiz
        System.out.println(dosyayolu);

        boolean isExist = Files.exists(Paths.get(dosyayolu));
        Assert.assertTrue(isExist);
        /*
        - Fail -> PATH YANLIS, dosya masa ustunde degil, dosya adi yanlis ya da arada onedrive gibi ex dosyalar var

        ***Kendimiz nasil buluruz dosya uzantisini: commend'i acip uzantisina bakmak istedigimiz dosyayi surukleyip
         commed'in ustune biraktigimiz zaman bize dosya yolunu veriri veya sag tus ozellikler orada da bulabiliriz

         */


    }
}
