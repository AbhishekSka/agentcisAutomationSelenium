package Smoke;

import Dirvers.DriverSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashBoard extends DriverSet {

    WebDriver wDriver;

    public void check() {
        wDriver.findElement(By.xpath("//div"));
    }

}
