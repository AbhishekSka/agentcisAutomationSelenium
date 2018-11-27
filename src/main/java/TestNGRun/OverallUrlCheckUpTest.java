package TestNGRun;


import Dirvers.DriverSet;
import Smoke.OverallUrlCheckUp;
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
