package day_16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_ExelRead {

    // -------  ADIMLAR -----------
    /* 1- Java dosyasina sag tikla ve resources adinda bir klasor olustur
       2- Excel dosyasini bu klasore at

       Resources dosyasi excel, word, text gibi data dosyalarinin bulundugu dosyadir

       Takip etmemiz gereken siralama :
       workbook(excel)  >  worksheet / sheet (sayfa)   >  row (satir)  > cell (veri hucresi)

     */

    @Test
    public void readExcelTest() throws Exception {
        String path = "./src/test/java/resources/Capitals.xlsx";     // excel dosyasini bulacagiz  // excel dosyamiz resour icinde.
                              // excel doyasinin ustune gelip sag tus copy path > copy path root diyoruz
                              // kopyaladigimiz path'i Stringin icine atarke "./" bu isareti basina koyuyoruz. cunku bu tamammi demek
        FileInputStream fileInputStream = new FileInputStream(path);  // Dosyayi ac demek
        // 1- Workbook'u (Excel dosyasini_ ac
        // 2- sheet icin obje olustur ve Sheet'i ac
        // 3- row icin obje olustur ve Ilk satir (row)'a git
        // 4- Ilk ssatirdaki ilk veriyi al ve yazdir

        Workbook workbook = WorkbookFactory.create(fileInputStream); // gormus oldugumuz dosyayi ac icine gir
     //   Sheet sheet1 = workbook.getSheetAt(0);  //indexle alir
        Sheet sheet1 = workbook.getSheet("Sheet1");  // isimle alir bu daha cok tercih edilir
        Row row1 = sheet1.getRow(0);  // index numarasini gireriz bu da ilk satir
        Cell cell1 = row1.getCell(0);  // ilk hucredeki data'yi aldik

        System.out.println(cell1);

        // 1. satir 2. sutun
        Cell cell12 =sheet1.getRow(0).getCell(1);
        System.out.println(cell12);

        // 3. satir 1. sutunyazdir ve o verinin France oldugunu test et
        String cell13 = sheet1.getRow(2).getCell(0).toString(); // bunu stringe cevirmeliyiz cunku assert yapabilmek icin. cell ile assert edemeyiz
        System.out.println(cell13);
        Assert.assertEquals("France" , cell13);

        //Exceldeki toplam kullanilan satir sayisini bul
        //1. Yol
        int sonSatirSayisi = sheet1.getLastRowNum()+1; // son satir numarasini verir. fakat 0'dan basladigi icin +1 yapmaliyiz
        System.out.println(sonSatirSayisi);
        //2. Yol
        int kullanilanSatirSayisi = sheet1.getPhysicalNumberOfRows(); //1'den baslar
        System.out.println(kullanilanSatirSayisi);  // eger alt alta olan satirlarin arasinda bos satir varsa onu saymaz

        // Country ve Capitals key ve value'lari map'a alip print et
        // oncelikle variable olusturlalim. bu variable exceldeki country ve capital verilerini hold edecek yani tutacak
        Map<String,String> ulkeBaskentleri = new HashMap<>();

        for(int rowSayisi=1 ; rowSayisi<kullanilanSatirSayisi ; rowSayisi ++){ // row sayisi 1'den baslayacak cunku basliklari almak istemiyorum
            String country = sheet1.getRow(rowSayisi).getCell(0).toString();
            String capital = sheet1.getRow(rowSayisi).getCell(1).toString();
            ulkeBaskentleri.put(country,capital);  // Map ile for'u birlestirdik
        }
        System.out.println(ulkeBaskentleri);

        TreeMap sirali = new TreeMap(ulkeBaskentleri);
        System.out.println(sirali);   //  map'leri sirali bir sekilde yazdirabilmek icin bunu kullanabilirriz




    }
}
