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

        String date = "12-09-2018";
        String dateArray[] = date.split("-"); //(12,08,2018)
        String day=dateArray[0];
        String month = dateArray[1];
        String year=dateArray[2];

        //Choose date modal
        WebElement datePicker = (WebElement) wdriver.findElements(By.id("//div[@class='flatpickr-calendar animate arrowTop']"));
        datePicker.click();

        String beforePath = "";
        String afterPah = "";


    }

}
