package run;

import Dirvers.DriverSetup;
import Forms.OverallUrlCheckUp;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class OverallUrlCheckUpTest extends DriverSetup{
    OverallUrlCheckUp overallUrlCheckUp;

    @Test
    public void runOverallUrlCheckUpTest() throws IOException {
        overallUrlCheckUp = new OverallUrlCheckUp(wDriver);
        overallUrlCheckUp.linkCheck();

    }

}
