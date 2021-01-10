package online.rumac.common.interactions;

import com.synergy.core.driver.mobile.MobileDriver;

public class Swipe {

    private final MobileDriver driver;

    private final ScreenPoints screen;
    private int scrollDurationMS;
    private long threadSleep;

    public Swipe(MobileDriver driver) {
        this.driver = driver;
        screen = new ScreenPoints(driver, 50);
        scrollDurationMS = 150;
        threadSleep = 0;
    }

    private void scroll(int numberOfScrolls, int startX, int startY, int endX, int endY) {
        try {
            Thread.sleep(threadSleep);
            driver.screen().scroll(numberOfScrolls, scrollDurationMS,
                    startX, startY, endX, endY);
            threadSleep = 0;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void right(int numberOfScrolls) {
        scroll(numberOfScrolls,
                (int) screen.rightEdgeOffset.getX(), (int) screen.center.getY(),
                (int) screen.leftEdgeOffset.getX(), (int) screen.center.getY());
    }

    public void left(int numberOfScrolls) {
        scroll(numberOfScrolls,
                (int) screen.leftEdgeOffset.getX(), (int) screen.center.getY(),
                (int) screen.rightEdgeOffset.getX(), (int) screen.center.getY());
    }

    public void up(int numberOfScrolls) {
        scroll(numberOfScrolls,
                (int) screen.center.getX(), (int) screen.center.getY(),
                (int) screen.center.getX(), (int) screen.downEdgeOffset.getY());
    }

    public void down (int numberOfScrolls) {
        scroll(numberOfScrolls,
                (int) screen.center.getX(), (int) screen.center.getY(),
                (int) screen.center.getX(), (int) screen.upEdgeOffset.getY());
    }

    public void setScrollDurationMS(int scrollDurationMS) {
        this.scrollDurationMS = scrollDurationMS;
    }

    public void setThreadSleep(long threadSleep) {
        this.threadSleep = threadSleep;
    }

    public void setOffset(int offset) {
        screen.setOffset(offset);
    }
}
