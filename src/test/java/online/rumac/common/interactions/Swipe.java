package online.rumac.common.interactions;

import com.synergy.core.driver.mobile.MobileDriver;
import online.rumac.common.logger.Log;

public class Swipe {

    private final MobileDriver driver;

    private final ScreenPoints screen;
    private int scrollDurationMS;

    public Swipe(MobileDriver driver) {
        this.driver = driver;
        screen = new ScreenPoints(driver, 50);
        scrollDurationMS = 50;
    }

    public Swipe setScrollDurationMS(int scrollDurationMS) {
        this.scrollDurationMS = scrollDurationMS;
        return this;
    }

    public void right(int numberOfScrolls) {
        Log.onTerminal("ATTEMPTING TO SCROLL RIGHT");
        driver.screen().scroll(numberOfScrolls, scrollDurationMS,
                (int) screen.rightEdgeOffset.getX(), (int) screen.center.getY(),
                (int) screen.leftEdgeOffset.getX(), (int) screen.center.getY());

        Log.onTerminal("RIGHT SCROLL SUCCESSFUL");
    }

    public void left(int numberOfScrolls) {
        Log.onTerminal("ATTEMPTING TO SCROLL LEFT");
        driver.screen().scroll(numberOfScrolls, scrollDurationMS,
                (int) screen.leftEdgeOffset.getX(), (int) screen.center.getY(),
                (int) screen.rightEdgeOffset.getX(), (int) screen.center.getY());

        Log.onTerminal("LEFT SCROLL SUCCESSFUL");
    }

    public void up(int numberOfScrolls) {
        Log.onTerminal("ATTEMPTING TO SCROLL UP");
        driver.screen().scroll(numberOfScrolls, scrollDurationMS,
                (int) screen.center.getX(), (int) screen.upEdgeOffset.getY(),
                (int) screen.center.getX(), (int) screen.downEdgeOffset.getY());

            Log.onTerminal("UP SCROLL SUCCESSFUL");
    }

    public void down (int numberOfScrolls) {
        Log.onTerminal("ATTEMPTING TO SCROLL DOWN");
        driver.screen().scroll(numberOfScrolls, scrollDurationMS,
                (int) screen.center.getX(), (int) screen.downEdgeOffset.getY(),
                (int) screen.center.getX(), (int) screen.upEdgeOffset.getY());

            Log.onTerminal("DOWN SCROLL SUCCESSFUL");
    }
}
