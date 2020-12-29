package online.rumac.tests.mainActivity;

import com.synergy.core.driver.mobile.android.AndroidDeviceInfo;
import online.rumac.tests.common.Base;
import org.testng.annotations.Test;

public class MainActivityTest extends Base {

    @Test(groups = {"all"})
    void connectionTest() {
        AndroidDeviceInfo deviceInfo = driver.info().getDeviceInfo();
        try {
            System.out.println(deviceInfo.getClass().getMethod(("getAppVersion")).getName() + " : " + deviceInfo.getAppVersion());
            System.out.println(deviceInfo.getClass().getMethod(("getAppCPUUsage")).getName() + " : " + deviceInfo.getAppCPUUsage());
            System.out.println(deviceInfo.getClass().getMethod(("getAppMemoryUsage")).getName() + " : " + deviceInfo.getAppMemoryUsage());
            System.out.println(deviceInfo.getClass().getMethod(("getDeviceTime")).getName() + " : " + deviceInfo.getDeviceTime());
            System.out.println(deviceInfo.getClass().getMethod(("getDeviceBatteryLevel")).getName() + " : " + deviceInfo.getDeviceBatteryLevel());
        } catch (NoSuchMethodException e) {
            System.err.println(e.getMessage());
        }
    }
}
