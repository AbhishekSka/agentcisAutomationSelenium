package Utilities;

import Dirvers.DriverSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker extends DriverSet {

    WebDriver wdriver;

    public DatePicker(WebDriver webDriver) {
        this.wDriver = webDriver;

    }


    public void datepick() {

        WebElement RootPicker = (WebElement) wdriver.findElements(By.id("//div[@id='datepicker-1509442930369']"));
        WebElement pickYear = RootPicker.findElement(By.className("//div[@class='flatpickr-month']/div/input[@class*='cur-year']"));
        pickYear.sendKeys("1991");
        //WebElement pickMonth=RootPicker.findElement(By.);


    }

}
