package online.rumac.common.interactions;

import com.synergy.core.driver.By;
import com.synergy.core.driver.mobile.MobileDriver;

public interface KeysSender {

    void sendKeysTo(By elementLocator, String keys);
}
