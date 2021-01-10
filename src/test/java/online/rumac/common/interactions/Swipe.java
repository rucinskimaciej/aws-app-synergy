package online.rumac.common.interactions;

import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.driver.mobile.MobileScreen;

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

    private void scrollToMost(String direction) {
        MobileScreen previousScreen;
        do {
            previousScreen = driver.screen();
            switchScroll(direction);
        } while (canScrollFurther(previousScreen));
    }

    private void switchScroll(String direction) {
        switch (direction) {
            case "up" : up(1);
                return;
            case "down" : down(1);
                return;
            case "left" : left(1);
                return;
            case "right" : right(1);
                return;
            default: throw new IllegalArgumentException("Unknown direction [ known : up down left right ]");
        }
    }

    public void toTop() {
        scrollToMost("up");
    }

    public void toBottom() {
        scrollToMost("down");
    }

    public void toMostLeft() {
        scrollToMost("left");
    }

    public void toMostRight() {
        scrollToMost("right");
    }

    private boolean canScrollFurther(MobileScreen previousScreen) {
        if (previousScreen == null) return false;
        return previousScreen.equals(driver.screen());
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
