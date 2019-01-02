package Dirvers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class DriverSet {

    protected WebDriver wDriver;
    @BeforeTest
    public void setup() throws InterruptedException {
        //Ubuntu
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//        chromeOptions.addArguments("--headless");
//;        chromeOptions.addArguments("--no-sandbox");

//       Mac
//       System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver/chromedriver.exe");
//       Settings for windows
//       System.setProperty("webdriver.chrome.driver","/Abhishek/chrome.exe");
//       System.setProperty("webdriver.chrome.driver", "usr/bin/chromedriver");

        wDriver = new ChromeDriver();

/*       //Live
        wDriver.get("https://democis.agentcisapp.com/auth/login");
        Thread.sleep(Long.parseLong("3000"));
        wDriver.manage().window().maximize();
        Thread.sleep(1000);
        wDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("sushan.amatya@gmail.com");
        WebElement password = wDriver.findElement(By.cssSelector("input#password"));
        password.sendKeys("agentcis");*/

        //Staging
        wDriver.get("https://360test.agentcisapp.com/");
//        Thread.sleep(Long.parseLong("3000"));
//        wDriver.manage().window().maximize();
        Thread.sleep(1000);
        wDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("dummymail1642+admin@gmail.com");
        WebElement password = wDriver.findElement(By.cssSelector("input#password"));
        password.sendKeys("agentcis");
        wDriver.findElement(By.xpath("//button[@class='loginButton']")).click();
        Thread.sleep(10000);

    }


    @AfterSuite

    public void driverQuit() {
        Reporter.log("this is running");
        wDriver.quit();
    }

}
