package main.java.TestNGRun;

import main.java.Dirvers.DriverSet;
import main.java.Forms.LeadsForm;
import org.testng.annotations.Test;

import java.io.IOException;

public class LeadsFromTest extends DriverSet {
    LeadsForm lTest;

    @Test
    public void runtLeadTest() throws IOException {

        lTest = new LeadsForm(wDriver);
        lTest.EnterEnquiry();
        lTest.FillEnquiry();
    }
}
