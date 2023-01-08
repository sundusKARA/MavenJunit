package day_11;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class C02_JavaFaker {

    @Test
    public void javaFakerTest() {
        //1. adim Faker objesi olustur
        Faker faker =new Faker();
        //2. Faker objesi ile fake data olustur
        String fName = faker.name().firstName();
        System.out.println(fName);

        //Last name datasi
        String lName = faker.name().lastName();
        System.out.println(lName);

        //kullanici adi
        String userName = faker.name().username();
        System.out.println(userName);

        //meslek isismler
        System.out.println(faker.name().title());

        //sehir isimleri
        System.out.println(faker.address().city());

        //eyalet
        System.out.println(faker.address().state());

        //full adrs
        System.out.println(faker.address().fullAddress());

        //cep phone
        System.out.println(faker.phoneNumber().cellPhone());

        //email
        System.out.println(faker.internet().emailAddress());

        //posta kodu
        System.out.println(faker.address().zipCode());

        //rastgfele 15 haneli numara
        System.out.println(faker.number().digits(15));

        /*
        TEST DATA : kullanici adi , sifre, tel, no, email, sehir

        *****Interwiev*****
        1) Test datalari kimden alinir?
        - BA yani business analyst'ten(Acceptance Crieteria'lari yazan kisi) gelir
        - Test Lead'ten de gelebilir
        - Manual Tester'dan gelebilir
        - Tech Lead veya Team Lead veya Dev Lead (aslinda ucu de hemen hemen ayni isi goruyor)
        - Developer
        - Database (veri tabani)
        - API call'lardan da gelebilir
        - Dokumantasyonlardan da gelebilir. Ornegin : API swagger dokumani.

        Test datalari kimden ALINMAZ : kullanicidan , scrum master (ortami organize eder, takim ici uyumu saglar, islerin gidisati takip eder, problem var mi varsa mudahale eder yoksa karismaz),


         */


    }
}
