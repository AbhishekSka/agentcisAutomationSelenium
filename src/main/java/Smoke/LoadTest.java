package Smoke;

import Dirvers.DriverSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoadTest extends DriverSet {

    WebDriver wDriver;

    public LoadTest(WebDriver webDriver) {
        this.wDriver = webDriver;
    }

    public void load() throws InterruptedException {

        wDriver.findElement(By.xpath("//li[@id=\"clientsMenu\"]")).click();
        Thread.sleep(10000);
        wDriver.findElement(By.xpath("//a[contains(@href,\"#/u/2242/activities\")]")).click();
        Thread.sleep(3000);

        List<WebElement> clientLinks = wDriver.findElements(By.xpath("//ul[@class=\"nav nav-tabs defaultNav\"]/li/a"));

        for(int j=0;j<1300;j++) {

            for (int i = 0; i < clientLinks.size(); i++) {
                WebElement singleClientLinks = clientLinks.get(i);

                System.out.println(i);
                singleClientLinks.click();
                Thread.sleep(5000);

            }
        }
    }
}
