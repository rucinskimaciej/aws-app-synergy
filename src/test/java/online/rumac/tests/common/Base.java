package online.rumac.tests.common;

import online.rumac.common.BaseSetup;
import org.testng.annotations.BeforeClass;

public class Base extends BaseSetup {

    @BeforeClass
    @Override
    protected void setup() {
        activityName = "MainActivity";
        super.setup();
    }
}
