package run;

import Dirvers.DriverSetup;
import Forms.LeadsForm;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LeadsFromTest extends DriverSetup{

    DriverSetup wDrivers;

    @Test
    public void runtLeadTest() throws InterruptedException {
        wDrivers = new DriverSetup();
        LeadsForm lTest = new LeadsForm();
        lTest.clickLeadform();
        lTest.FillLeads();
    }
}
