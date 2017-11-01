package Dirvers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetup {
    WebDriver wDriver;
    @BeforeClass
    public void setup() throws InterruptedException {
        wDriver =new ChromeDriver();
        System.setProperty("webdriver.chrome.drive","/Users/introcept/Downloads/dmg/chrome.exe");
        wDriver.get("https://democis.agentcisapp.com/");
        wDriver.manage().window().maximize();
        Thread.sleep(1000);
        //Login
        WebElement login = wDriver.findElement(By.id("email"));
        login.sendKeys("avseqskya@gmail.com");
        WebElement password=wDriver.findElement(By.id("password"));
        password.sendKeys("test1234");

    }

    @AfterClass
    public void driverQuit(){
        wDriver.quit();
    }
}
