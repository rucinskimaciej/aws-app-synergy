package online.rumac.common.interactions;

import com.synergy.core.driver.mobile.MobileDriver;
import javafx.geometry.Point2D;

import java.awt.Dimension;

public class Swipe {

    private final MobileDriver driver;
    private final ScreenDimensions screenDimensions;
    private int scrollDurationMS;

    public Swipe(MobileDriver driver) {
        this.driver = driver;
        screenDimensions = new ScreenDimensions(driver);
        scrollDurationMS = 10;
    }

    public Swipe setScrollDurationMS(int scrollDurationMS) {
        this.scrollDurationMS = scrollDurationMS;
        return this;
    }

    public void right(int numberOfScrolls) {
        swipeFromCenterTo(screenDimensions.leftEdgeOffset, numberOfScrolls);
    }

    public void left(int numberOfScrolls) {
        swipeFromCenterTo(screenDimensions.rightEdgeOffset, numberOfScrolls);
    }

    public void up(int numberOfScrolls) {
        swipeFromCenterTo(screenDimensions.downEdgeOffset, numberOfScrolls);
    }

    public void down (int numberOfScrolls) {
        swipeFromCenterTo(screenDimensions.upEdgeOffset, numberOfScrolls);
    }

    private void swipeFromCenterTo(Point2D edge, int numberOfScrolls) {
        driver.screen().scroll(numberOfScrolls, scrollDurationMS,
                (int) screenDimensions.center.getX(), (int) screenDimensions.center.getY(),
                (int) edge.getX(), (int) edge.getY());
    }
}
