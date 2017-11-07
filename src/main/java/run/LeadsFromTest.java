package run;

import Dirvers.DriverSetup;
import Forms.LeadsForm;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LeadsFromTest extends DriverSetup{

    @Test
    public void runtleadTest(){
        DriverSetup wDriver = new DriverSetup();
        LeadsForm lTest = new LeadsForm(wDriver);
        lTest.Leadform();
        lTest.FillLeads();
    }
}
