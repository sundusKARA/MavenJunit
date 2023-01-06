package day_10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_Actions_4 extends TestBase {
    @Test
    public void dragAndDropTest() {
//   Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);  //burada frame vardi icicne girmezsek kod calismaz. bir tane oldugu icin de indexi 0 olarak girdik. 
                                         // inspect yaptigimizda iframe yazisinin ustune gittigimizde isaretleniyorsa bizim alanimiz o zaman iframein icinde oldugunu anlariz

//   And user moves the target element(Drag me to my target) in to  destination(Drop here)
        WebElement kaynak = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement hedef= driver.findElement(By.xpath("//*[@id='droppable']"));
        
//  dargAndDrop() surukleme islemini gerceklestiri
        Actions actions = new Actions(driver);
        actions.dragAndDrop(kaynak,hedef).perform();
    }

    @Test
    public void clickAndHoldTest() {
        //Bu method cok kullanilmaz. tut surekli birak diyoruz. ama yukaridaki daha cok kullanilir
//   Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);  //burada frame vardi icicne girmezsek kod calismaz. bir tane oldugu icin de indexi 0 olarak girdik.
//  inspect yaptigimizda iframe yazisinin ustune gittigimizde isaretleniyorsa bizim alanimiz o zaman iframein icinde oldugunu anlariz

//   And user moves the target element(Drag me to my target) in to  destination(Drop here)
        WebElement kaynak = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement hedef= driver.findElement(By.xpath("//*[@id='droppable']"));

//  dargAndDrop() surukleme islemini gerceklestiri
        Actions actions = new Actions(driver);
        actions.clickAndHold(kaynak) //kaynagi tut
                .moveToElement(hedef)  // hedefe koy
                .release()   //kaynagi birak
                .build()   //eger biz birden fazla fonksiyon cagirirsak bu islemleri birbirine sikica bagla, insa et, guclendir,
                .perform();   //calistir
    }

    @Test
    public void moveByOffSetTest() {
        //   Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        //   And user moves the target element(Drag me to my target) in to  destination(Drop here)
        WebElement kaynak = driver.findElement(By.xpath("//*[@id='draggable']"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(kaynak) //kaynagi tuttuk
                .moveByOffset(438,30)  //belirli bir koordinata sureklemek icin kullanirizi. x = saga sola y=asagi yukari
                .release() // tutulan kaynagi birakmaliyiz
                .build()
                .perform();


    }
}
