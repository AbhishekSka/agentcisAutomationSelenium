package run;

import Dirvers.DriverSetup;
import Forms.LeadsForm;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LeadsFromTest {

    WebDriver webDriver;

    @Test
    public void runtLeadTest(){

        LeadsForm lTest = new LeadsForm(webDriver);
        lTest.clickLeadform();
        lTest.FillLeads();
    }
}
