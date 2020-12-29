package online.rumac.tests.common;

import online.rumac.common.BaseSetup;
import org.testng.annotations.BeforeTest;

public class Base extends BaseSetup {

    @BeforeTest
    @Override
    protected void setup() {
        activityName = "MainActivity";
        super.setup();
    }
}
