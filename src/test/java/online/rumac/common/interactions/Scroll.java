package online.rumac.common.interactions;

import com.synergy.core.driver.ScreenText;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.driver.mobile.MobileScreen;

import java.util.List;

public class Scroll {

    private final MobileDriver driver;

    private final ScreenPoints screen;
    private int scrollDurationMS;
    private long threadSleep;

    public Scroll(MobileDriver driver) {
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

/*  // USABLE IF THERE IS A WAY TO COMPARE SCREENS (driver.screen())
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
        return !areEqualScreens(previousScreen,driver.screen());
    }

    private boolean areEqualScreens(MobileScreen screen1, MobileScreen screen2) {
        if (screen1 == null || screen2 == null) return false;
        List<ScreenText> s1 = screen1.getText();
        List<ScreenText> s2 = screen2.getText();
        if (s1 == null || s2 == null) return false;
        System.err.print(screen1.getText().get(s1.size() - 1));
        System.out.print(" vs ");
        System.err.print(screen2.getText().get(s2.size() - 1) + "\n");
        return s1.get(s1.size() - 1).getText().equals(s2.get(s2.size() - 1).getText());
    }
*/


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
