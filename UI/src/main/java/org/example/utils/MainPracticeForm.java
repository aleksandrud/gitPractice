package org.example.utils;


import org.example.driver.Driver;
import org.example.models.Student;
import org.example.pages.PracticeFormPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;


public class MainPracticeForm {
    static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        driver = Driver.getDriver();
    }

    @Test
    public void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        Student student= new Student();
        student.setFirstName("Sasha");
        student.setLastName("Yudenko");
        student.setEMail("Udenko@mail.com");
        student.setCurrentAddress("Suerkulova 2");
        student.setPhoneNumber("0552291995");
        PracticeFormPages practiceFormPages= new PracticeFormPages();
        practiceFormPages.fillUpTheForm(student).checkTheStudentDetails(student);






//        student1.fillUpTheFirstName(fakeDataProvider.generateFakeFullName())
//                .fillUpTheLastName(fakeDataProvider.generateFakeLastName())
//                .fillUpTheUserEmail(fakeDataProvider.generateFakeEmail())
//                .fillUpTheUserNumber(fakeDataProvider.generationPhoneNUmber())
//                .fillUpTheCurrentAddress(fakeDataProvider.generationFakeCurrentAddress())
//                .clickGender()
//                .clickHobbies()
//                .selectState()
//                .selectSubject()
//                .selectSubject()
//                .selectSubject()
//                .setUploadPicture()
//                .selectSubmitBtn();
        Thread.sleep(5000);
        Driver.closeDriver();

    }
}