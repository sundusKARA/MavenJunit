package day_16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C02_WriteExcel {
    @Test
    public void writeExcelTest() throws Exception {
        //Excel dosyasina yazi da yazdirabiliriz.
        // workbook > sheet > row > cell > yazdir  > kaydet
        String path = "./src/test/java/resources/Capitals.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 = workbook.getSheet("Sheet1");
        Row row1 = sheet1.getRow(0);

        //1. satur 3. sutunu creat et. bunu creat etmezsek java orayi null goruyor
       Cell cell3 = row1.createCell(2);  // sutunu olusturdum yani excelde 3. sutuna tikladim
       cell3.setCellValue("NUFUS"); //yazdik, sistem otomatik kaydetmiyor
        //2. satir 3.sutuna 450000
        sheet1.getRow(1).createCell(2).setCellValue("450000");
        //3. satir 3. sutuna 350000
        sheet1.getRow(2).createCell(2).setCellValue("3500000");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream); // kaydetme isini yaptik




    }
}
