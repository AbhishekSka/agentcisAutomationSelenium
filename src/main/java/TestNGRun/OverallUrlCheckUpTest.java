package main.java.TestNGRun;


import main.java.Dirvers.DriverSet;
import main.java.Smoke.OverallUrlCheckUp;
import org.testng.annotations.Test;

import java.io.IOException;

public class OverallUrlCheckUpTest extends DriverSet {
    OverallUrlCheckUp overallUrlCheckUp;

    @Test
    public void runOverallUrlCheckUpTest() throws IOException {
        overallUrlCheckUp = new OverallUrlCheckUp(wDriver);
        overallUrlCheckUp.linkCheck();

    }

}
