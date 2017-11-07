package Dirvers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;

public class DriverSetup implements WebDriver {


    WebDriver wDriver;


    @BeforeTest(alwaysRun = true)
    public void setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        //System.setProperty("webdriver.chrome.driver","/Users/introcept/Downloads/dmg/chrome.exe");
        wDriver =new ChromeDriver();
        wDriver.get("https://democis.agentcisapp.com/");
        wDriver.manage().window().maximize();
        Thread.sleep(1000);

        //Login
        WebElement login = wDriver.findElement(By.id("email"));
        login.sendKeys("avseqskya@gmail.com");
        WebElement password=wDriver.findElement(By.id("password"));
        password.sendKeys("test1234");
        wDriver.findElement(By.xpath("//button[@class='loginButton']")).click();
        Thread.sleep(1000);

    }


    @AfterTest(alwaysRun = true)
    public void driverQuit(){
        wDriver.quit();
    }

    public void get(String s) {

    }

    public String getCurrentUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public List<WebElement> findElements(By by) {
        return null;
    }

    public WebElement findElement(By by) {
        return null;
    }

    public String getPageSource() {
        return null;
    }

    public void close() {

    }

    public void quit() {

    }

    public Set<String> getWindowHandles() {
        return null;
    }

    public String getWindowHandle() {
        return null;
    }

    public TargetLocator switchTo() {
        return null;
    }

    public Navigation navigate() {
        return null;
    }

    public Options manage() {
        return null;
    }
}
