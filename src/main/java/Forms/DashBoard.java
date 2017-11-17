package Forms;

import Dirvers.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard extends DriverSetup{
    WebDriver wDriver;
    public void check(){
        wDriver.findElement(By.xpath("//div"));
    }

}
