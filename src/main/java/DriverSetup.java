
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class DriverSetup {

    @BeforeClass
    public void setup() throws InterruptedException {
        WebDriver wDriver =new ChromeDriver();
        System.setProperty("","");
        wDriver.get("");
        Thread.sleep(1000);


    }
}
