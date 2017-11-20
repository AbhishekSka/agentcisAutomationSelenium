package run;

import Dirvers.DriverSetup;
import Forms.LeadsForm;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LeadsFromTest extends DriverSetup{
   LeadsForm lTest;

    @Test
    public void runtLeadTest() throws InterruptedException {

         lTest = new LeadsForm(wDriver);
        lTest.clickLeadform();
        lTest.FillLeads();
    }
}
