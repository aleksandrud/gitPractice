import org.example.driver.Driver;
import org.example.pages.PracticeFormPages;
import org.example.pages.TextBoxPage;
import org.example.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeFormPages practiceFormPages;
    public FakeDataProvider fakeDataProvider;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiceFormPages = new PracticeFormPages();
        fakeDataProvider = new FakeDataProvider();
    }

    @AfterClass(alwaysRun = true)
    public  void tearDown(){
        Driver.closeDriver();
    }

}
