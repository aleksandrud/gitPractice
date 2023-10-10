import org.example.models.Student;
import org.example.utils.FakeDataProvider;
import org.testng.annotations.Test;

import java.awt.*;

public class PracticeFormTest extends BaseTest{
    @Test
    void fillUpTheFormTest() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        Student student = fakeDataProvider.creatFakeStudent();
        practiceFormPages.fillUpTheForm(student).checkTheStudentDetails(student);




    }
}
