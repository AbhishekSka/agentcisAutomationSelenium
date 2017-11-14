package Dirvers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;

public class DriverSetup  {


    WebDriver wDriver;


    @BeforeTest(alwaysRun = true)
    public void setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        //System.setProperty("webdriver.chrome.driver","/Users/introcept/Downloads/dmg/chrome.exe");
        wDriver = new ChromeDriver();
        wDriver.get("https://democis.agentcisapp.com/");
        wDriver.manage().window().maximize();
        Thread.sleep(1000);

        //Login
        WebElement login = wDriver.findElement(By.id("email"));
        login.sendKeys("avseqskya@gmail.com");
        WebElement password = wDriver.findElement(By.id("password"));
        password.sendKeys("test1234");
        wDriver.findElement(By.xpath("//button[@class='loginButton']")).click();
        Thread.sleep(1000);

    }


    @AfterTest(alwaysRun = true)
    public void driverQuit() {
        wDriver.quit();
    }

}
