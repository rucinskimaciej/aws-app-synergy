package online.rumac.mainActivityTest;

import com.synergy.core.driver.mobile.android.AndroidDeviceInfo;
import org.testng.annotations.Test;

public class First extends BeforeAfter {

    @Test(groups = {"enabled"})
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
