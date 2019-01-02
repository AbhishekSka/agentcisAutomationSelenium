package TestNGRun;

import Dirvers.DriverSet;
import Smoke.LoadTest;
import org.testng.annotations.Test;


    public class LoadTestrun extends DriverSet {
        LoadTest loadTest;

        @Test
        public void runLoadTest() throws InterruptedException {
            loadTest = new LoadTest(wDriver);
            loadTest.load();

        }

    }


