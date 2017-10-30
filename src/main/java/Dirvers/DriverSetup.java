package Dirvers;

import org.openqa.selenium.WebDriver;
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


    }

    @AfterClass
    public void driverQuit(){
        wDriver.quit();
    }
}
