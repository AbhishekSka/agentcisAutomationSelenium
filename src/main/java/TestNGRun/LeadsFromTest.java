package TestNGRun;

import Dirvers.DriverSet;
import Forms.LeadsForm;
import org.testng.annotations.Test;

import java.io.IOException;

public class LeadsFromTest extends DriverSet {
    LeadsForm lTest;

    @Test
    public void runtLeadTest() throws IOException, InterruptedException {

        lTest = new LeadsForm(wDriver);
        lTest.EnterEnquiry();
        lTest.FillEnquiry();
    }
}
