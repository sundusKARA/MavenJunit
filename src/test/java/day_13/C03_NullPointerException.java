package day_13;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.TestBase;

public class C03_NullPointerException extends TestBase {
    WebDriver driver;
    Faker faker;

    @Test
    public void tets01() {
        driver.get("https://www.techproeducation.com");//java.lang.NullPointerException
    }
    @Test
    public void nullPointerExceptionTest2(){
//        faker=new Faker();
        System.out.println(faker.name().fullName());//java.lang.NullPointerException
    }
    }

