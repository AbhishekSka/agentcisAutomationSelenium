package Dirvers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;

public class DriverSetup  {


    public WebDriver wDriver;


    @BeforeTest(alwaysRun = true)
    public void setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        //System.setProperty("webdriver.chrome.driver","/Users/introcept/Downloads/dmg/chrome.exe");
        wDriver = new ChromeDriver();
        wDriver.get("https://democis.staging.agentcis.com/auth/login");
        wDriver.manage().window().maximize();
        Thread.sleep(1000);

        //Login
        WebElement login = wDriver.findElement(By.id("email"));
        login.sendKeys("abhishek.shakya@introcept.co");
        WebElement password = wDriver.findElement(By.id("password"));
        password.sendKeys("agentcis");
        wDriver.findElement(By.xpath("//button[@class='loginButton']")).click();
        Thread.sleep(3000);

    }


    @AfterTest(alwaysRun = true)
    public void driverQuit() {
        wDriver.quit();
    }

}
