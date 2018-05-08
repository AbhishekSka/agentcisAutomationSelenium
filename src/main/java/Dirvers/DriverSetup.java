package Dirvers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetup  {


    public WebDriver wDriver;


    @BeforeTest(alwaysRun = true)
    public void setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        //System.setProperty("webdriver.chrome.driver","/Abhishek/chrome.exe");
        wDriver = new ChromeDriver();
        wDriver.get("https://democis.staging.agentcis.com/auth/login");
        wDriver.manage().window().maximize();
        Thread.sleep(1000);

        //Filling Login for and enter
        //WebElement login = wDriver.findElement(By.cssSelector("input#email"));
        wDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("dummymail1642@gmail.com");
        WebElement password = wDriver.findElement(By.cssSelector("input#password"));
        password.sendKeys("agentcis");
        wDriver.findElement(By.xpath("//button[@class='loginButton']")).click();
        Thread.sleep(3000);

    }


    @AfterTest(alwaysRun = true)
    public void driverQuit() {
        wDriver.quit();
    }

}
